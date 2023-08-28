
$('#clk-btn').click(function(){
    getAllUsers();
})

async function getAllUsers() {
    const url = "http://localhost:8082/get-all";
    const result = await fetch(url, {method: 'GET'});
    const finalResult = await result.json();

    console.log(finalResult);

}


$('#user-btn').click(function() {  
    getUserById();
})


async function getUserById() {

    const userId = $('#user-id').val();

    const url = 'http://localhost:8082/get-user?id='+ userId;
    const res = await fetch(url, {method: 'GET'});
    const finalRes = await res.json();
    console.log(finalRes);

    $('#result-data').html('<h1>'+ finalRes.firstName + ' '+ finalRes.lastName + '</h1>');

}


async function allResultData() {

    const url = 'http://localhost:8082/get-all'; 
    const resultData = await fetch(url, {method: 'GET'});
    const finalData = await resultData.json();
    let allNames = "";
    for(let i = 0; i < finalData.length; i++){
        
        allNames = allNames + '<h1>'+finalData[i].id  + ' ' +  finalData[i].firstName +' '+ finalData[i].lastName + '</h1>';    
    }
    
    $('#all-result-data').html(allNames);

}


async function deleteUser() {
    const userId = $('#delete-id').val();
    const url = 'http://localhost:8082/delete-user/'+userId; 
    await fetch(url, {method: 'DELETE'});

    allResultData();
}