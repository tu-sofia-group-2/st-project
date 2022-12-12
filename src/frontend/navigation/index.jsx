import { StyleSheet, Text, View,Image,TextInput,Button, Pressable } from 'react-native';
import { useState } from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator} from '@react-navigation/native-stack';

import {navigationRef} from './navRef'

import Login from '../pages/Login' 
import Home from '../pages/Home' 
import NavBar from '../components/NavBar';
import Profile from '../pages/Profile';

const Stack = createNativeStackNavigator()

export default function index() {
    return (
        <>
        <View style={styles.container}>
            <NavigationContainer ref={navigationRef}>
                <Stack.Navigator>
                    <Stack.Screen name="Profile" component={Profile} options={{headerShown: false}} />
                    <Stack.Screen name="Login" component={Login} options={{headerShown: false}} />
                    <Stack.Screen name="Home" component={Home} options={{headerShown: false}} />
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