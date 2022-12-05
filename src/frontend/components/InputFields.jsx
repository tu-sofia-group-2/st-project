import React, {useEffect, useState } from "react";
import { SafeAreaView, StyleSheet, TextInput } from "react-native";


const InputFields = ({value, defaultText, active, error, onChange}) =>{

  const onChangeText=(data)=>{
    onChange(data);
    console.log(value);
  }
  const [GeneratedStyle, setGeneratedStyle] = useState(styles.input);
  const generateStyle = (error)=>{
    if(error){
      return StyleSheet.compose(styles.error);
    }
    else{
      return StyleSheet.compose(styles.input);
    }
  }
  useEffect(()=>{
      const s = generateStyle(error);
      setGeneratedStyle(s);
      console.log(error);
  },[error])
  
  return(
    <TextInput
        style ={GeneratedStyle}
        onChangeText = {(e)=>onChangeText(e)}
        placeholder = {defaultText}
        value = {value}
      >
    </TextInput>
  )
}

InputFields.defaultProps={
    value: null,
    defaultText: "",
    active: true,
    error: false,


}
const styles = StyleSheet.create({
    input: {
      height: 40,
      margin: 12,
      borderWidth: 1,
      padding: 10,
    },
    error: {
      height: 40,
      margin: 12,
      borderWidth: 1,
      padding: 10,
      borderColor: "red"
    }
  });
export default InputFields;