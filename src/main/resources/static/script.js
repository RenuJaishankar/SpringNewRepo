console.log("This script works great")
fetch('/cakes')
        .then(response => response.json())
        .then(json  => {
        for(el in json){
          console.log(json[el])

          let tbody=document.queryselector("tbody")
          let tr=document.queryselector("tr")


         }


         })