console.log("This script works great")
fetch('/cakes')
        .then(response => response.json())
        .then(json  => {

        for(el in json){
          console.log(json[el])
          console.log("hello script works")
          let tbody=document.querySelector("tbody")
          let tr=document.createElement("tr")
             tr.setAttribute("Contenteditable","false")
            tr.classList = 'row-${json[el].id} item'
            tr.innerHTML = '<td> {json[el].id} </td>
            <td>${json[el].id}</td>
            <td>${json[el].name}</td>
            <td>${json[el].frosted}</td>
            <td><i class="fas fa-save icon-${json[el].id}"
            style="cursor-pointer" onClick= "saveItem(${json[el].id } )"
                                                              </i> </td>'
            tbody.appendChild(tr)

         }

         })
//delete method that is tied to the trash icon.
const deleteItem = (id) => {
fetch('/cake/${id}', {
   method:'DELETE'
})
    .then(item.remove())
    .then(console.log('this works'))
}

//update function that will be tied to pencil icon
//this function will allow the text in our rows to be editable
const updateItem =(id) =>{
let item= document.querySelector('.row-${id}')
          item.toggleAttribute("contenteditable")
}

const addItem =() => {
let nameInput = document.getElementById("name").value
let frostedInput = (document.getElementById('checkbox').checked ? true:false)
let sampleCake = {
     name:nameInput,
     frosted:frostedInput
}
console.log(sampleCake)
fetch('/cake',{
headers:{
'ACCEPT':'application/json',
'Content-Type':'application/json'
},
method:'POST'
body:JSON.stringify(sampleCake)
}).then(console.log('Cake posted'))
.then(location.reload())
}

const saveItem =(id) => {
let nameInput = document.getElementById('${id}-name').innerText
let frostedInput = document.getElementById('${id}-checkbox').checked ? true:false
let sampleCake = {
name:nameInput,
frosted:frostedInput
}
console.log(sampleCake)
fetch('/cake/${id}' ,{
headers:{
     'Accept':'application/json',
     'Content-Type':'application/json'
},
method:'PUT',
body:JSON.stringify(sampleCake)
})
    .then(response=>response.json)
    .then(json=>console.log(json))
    .then(location.reload())
}






