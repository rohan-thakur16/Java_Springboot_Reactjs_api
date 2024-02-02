import React,{useEffect, useState} from 'react'
import { listEmployees } from '../services/EmployeeService'

const ListEmployeeComponent =() =>{
   
const [employees,setEmployee] =useState([])

useEffect(()=>{
    listEmployees.then((response)=>{
        console.log(response.data+"hahaha")
        setEmployee(response.data)
    }).catch(error=>{
            console.error(error);
    })
},[])
// useEffect(()=>{
// listEmployees.then((response)=>{
// setEmployee(response.)
// })
// ,[])  ;

  return (
    <div className='conatiner'>
        <h2 className='text_center'>List of Employees   </h2>
        <table className='table table-striped table-bordered'>
            <thead>
            <tr>
            <th>
                    Employee ID
                </th>
                <th>
                    Employee First Name 
                </th>
                <th>
                    Employee Last Name
                </th>
                <th>
                    Employee Email Id
                </th>
            </tr>
            </thead>
            <tbody>
                {employees.map(employee=>
                <tr key={employee.id}>
                    <td>
                        {employee.id}
                    </td>
                    <td>
                        {employee.firstName}
                    </td>
                    <td>
                        {employee.lastName}
                    </td>
                    <td>
                        {employee.email}
                    </td>

                </tr>)}
                <tr>

                </tr>
            </tbody>
        </table>
        
        
        </div>
  )
}

export default ListEmployeeComponent