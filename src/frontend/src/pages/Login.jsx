import { StyleSheet, Text, View, TouchableOpacity, Image, TextInput, Button} from 'react-native'
import {useState} from "react"
import React from 'react'

export default function Login() {
    const [user, setUser] = useState({
        email: "",
        password: ""
    });
   
    return (
        <View style={styles.container}>
            <Image style={styles.image} source={require("../../assets/logo.png")} />
    
            <View style={styles.inputView}>
            <TextInput
                style={styles.TextInput}
                placeholder="Email"
                placeholderTextColor="#003f5c"
                onChangeText={(mail) => setUser((p)=>{
                    return {
                        ...p,
                        email: mail
                    }
                })}
            />
            </View>
    
            <View style={styles.inputView}>
            <TextInput
                style={styles.TextInput}
                placeholder="Password"
                placeholderTextColor="#003f5c"
                secureTextEntry={true}
                onChangeText={(pass) => setUser((e)=>{
                    return{
                        ...e,
                        password: pass
                    }
                })}
            />
            </View>
    
            <TouchableOpacity>
                <Text style={styles.forgotBtn}>Forgot your Password?</Text>
            </TouchableOpacity>
    
            <TouchableOpacity style={styles.loginBtn}>
                <Text style={styles.loginText}>LOGIN</Text>
            </TouchableOpacity>
        </View>
    );
}

const styles = StyleSheet.create({
    container: {
      flex: 1,
      backgroundColor: "#fff",
      alignItems: "center",
      justifyContent: "center",
    },
   
    image: {
      marginBottom: 40,
      height:350,
      width:350,
    },
   
    inputView: {
      backgroundColor: "#a8cfe8",
      borderRadius: 30,
      width: "70%",
      height: 45,
      marginBottom: 20,
   
      alignItems: "center",
    },
   
    TextInput: {
      height: 50,
      flex: 1,
      padding: 10,
      marginLeft: 20,
    },
   
    forgotBtn: {
      height: 30,
      marginBottom: 10,
    },
   
    loginBtn: {
      width: "80%",
      borderRadius: 25,
      height: 50,
      alignItems: "center",
      justifyContent: "center",
      backgroundColor: "#F0B032",
    },
});