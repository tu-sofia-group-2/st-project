import { StyleSheet, Text, View,Image,TextInput,Button, Pressable } from 'react-native';
//import { useState } from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs';
import Login from '../pages/Login' 
//import NavBar from '../components/NavBar';
import Profile from '../pages/Profile';
import UserPageWrapper from '../pages/UserPageWrapper';
import SubjectsPageWrapper from '../pages/SubjectsPageWrapper';
import FontAwesome from '@expo/vector-icons/Ionicons'

//import { navigationRef } from '../components/util/NavRef';
const PROFILE = "Profile";
const SUBJECTS = "Subjects";

const Tab = createBottomTabNavigator()
 const Navigation=()=> {
    return (
        <>
        <View style={styles.container}>
            <NavigationContainer  >
                <Tab.Navigator
                screenOptions={({route})=>({
                    tabBarIcon : ()=>{
                        if(route.name == PROFILE) {
                            return <FontAwesome name="home" size={28} color="#a8cfe8" />
                        } else if (route.name == SUBJECTS) {
                            return <FontAwesome name="book" size={28} color="#a8cfe8" />
                        }
                    }
                })}>
                    {/* <Tab.Screen name={PROFILE} component={Profile} options={{headerShown: false}} /> */}
                    {/* <Tab.Screen name="Login" component={Login} options={{headerShown: false}} /> */}
                    <Tab.Screen name={PROFILE} component={UserPageWrapper} options={{headerShown: false}} />
                    <Tab.Screen name={SUBJECTS} component={SubjectsPageWrapper} options={{headerShown: false}} />
                </Tab.Navigator>
            </NavigationContainer>
        </View>
         
        </>
    )
}
 const styles = StyleSheet.create({
    container:{
        flex:1
    }
 })
 export default Navigation;