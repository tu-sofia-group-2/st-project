import { StyleSheet, Text, View,Image,TextInput,Button, Pressable } from 'react-native';
import { useState } from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator} from '@react-navigation/native-stack';


import Login from '../pages/Login' 
import NavBar from '../components/NavBar';
import Profile from '../pages/Profile';

const Stack = createNativeStackNavigator()

export default function index() {
    return (
        <>
        <View style={styles.container}>
            <NavigationContainer >
                <Stack.Navigator>
                    <Stack.Screen name="Profile" component={Profile} options={{headerShown: false}} />
                    <Stack.Screen name="Login" component={Login} options={{headerShown: false}} />
                </Stack.Navigator>
            </NavigationContainer>
        </View>
            <NavBar/>
        </>
    )
}
 const styles = StyleSheet.create({
    container:{
        flex:1
    }
 })