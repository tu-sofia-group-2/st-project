import React, {useState} from "react";
import UserForm from "./UserForm";


const UserFormWrapper=()=>{
    const [id,setId] = useState(null);
    const [errId, setErrId] = useState(false);
    const [facultyId, setFacultyId] = useState(null);
    const [errFacId, setErrFacId] = useState(false); 
    return(
        <UserForm id= {id} setId = {setId} errId ={errId} setErrId = {setErrId}
        facultyId = {facultyId} setFacultyId = {setFacultyId} 
        errFacId = {errFacId} setErrFacId={setErrFacId}>
        </UserForm>
    )
}
export default UserFormWrapper