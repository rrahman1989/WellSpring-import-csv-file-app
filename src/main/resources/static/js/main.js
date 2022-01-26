'use strict';

var singleUploadForm = document.querySelector('#singleUploadForm');
var singleFileUploadInput = document.querySelector('#singleFileUploadInput');
var singleFileUploadError = document.querySelector('#singleFileUploadError');
var singleFileUploadSuccess = document.querySelector('#singleFileUploadSuccess');
var singleFileDataSuccess = document.querySelector('#grid');


function uploadSingleFile(file) {
    var formData = new FormData();
    formData.append("file", file);

    var xhr = new XMLHttpRequest();
    xhr.open("POST", "/api/csv/upload");

    xhr.onload = function() {
        console.log(xhr.responseText);
        var response = JSON.parse(xhr.responseText);
        if(xhr.status == 200) {
            singleFileUploadError.style.display = "none";
            singleFileUploadSuccess.innerHTML = "<p>File Uploaded Successfully.</p><p>DownloadUrl : <a href='" + response.fileDownloadUri + "' target='_blank'>" + response.fileDownloadUri + "</a></p>";
            singleFileUploadSuccess.style.display = "block";
            singleFileDataSuccess.style.width = "100%";
            singleFileDataSuccess.style.height = "250px";

            
            
            
        } else {
            singleFileUploadSuccess.style.display = "none";
            singleFileUploadError.innerHTML = "<p>"+(response && response.message)+"<p>" || "Some Error Occurred";
            singleFileUploadSuccess.style.display = "block";

        }
    }

    xhr.send(formData);
}

singleUploadForm.addEventListener('submit', function(event){
    var files = singleFileUploadInput.files;
    if(files.length === 0) {
        singleFileUploadError.innerHTML = "Please select a file";
        singleFileUploadError.style.display = "block";
    }
    uploadSingleFile(files[0]);
    event.preventDefault();
    	
    	
	$(function () {
	    $('#grid').w2grid({
	        name: 'grid',
	        url    : 'http://localhost:8080/api/csv/tutorials',
	        header: 'List of Names',
	        columns: [
	          { field: 'id', text: 'ID', size: '10%' },
	          { field: 'trainLine', text: 'Train Line', size: '25%' },
	          { field: 'routeName', text: 'Route Name', size: '25%' },
	          { field: 'runNumber', text: 'Run Number', size: '15%' },
	          { field: 'operatorId', text: 'Operator ID', size: '15%' }
	        ]
	    });
	});
	
    
}, true);