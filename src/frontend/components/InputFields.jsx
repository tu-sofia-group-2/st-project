import React, { useState } from "react";
import { SafeAreaView, StyleSheet, TextInput } from "react-native";


const InputFields = ({value, defaultText, active, error}) =>{

   const[text, onChangeText] = useState(null);
   
   return(
    <TextInput
        style ={styles.input}
        onChangeText = {onChangeText}
        placeholder = {defaultText}
        value = {text}
      >
    </TextInput>
   )
}

InputFields.defaultProps={
    value: null,
    defaultText: "",
    active: true,
    error: true,

}
const styles = StyleSheet.create({
    input: {
      height: 40,
      margin: 12,
      borderWidth: 1,
      padding: 10,
    },
  });
  export default InputFields;