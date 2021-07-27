import React, {Component, useState, useEffect} from 'react';
//import React from 'react'
import ToDoList from './Components/ToDoList'

function App () {
    const [message, setMessage] = useState("");
    const todos = [
        {id: 1, completed:false,title:'TASK 1'},
        {id: 2, completed:false,title:'TASK 2'},
        {id: 3, completed:false,title:'TASK 3'}

    ]
    useEffect(() => {
        fetch('/api/user/all')
            .then(response => response.text())
            .then(message => {
                setMessage(message);
            });
    },[])
    return (
        (<div className='wrapper'>
            <h1>ToDo</h1>
            <ToDoList todos ={todos} />
            
        </div>)
    )
}

export default App;