import { useState } from "react";
import { StyleSheet, Text, View, Image, TextInput, Button, Pressable } from 'react-native';
//import { useState } from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs';
import Login from '../pages/Login'
//import NavBar from '../components/NavBar';
import Profile from '../pages/Profile';
import UserPageWrapper from '../pages/UserPageWrapper';
import SubjectsPageWrapper from '../pages/SubjectsPageWrapper';
import FontAwesome from '@expo/vector-icons/Ionicons'
import { getLogin } from "../components/util/Fetch";

//import { navigationRef } from '../components/util/NavRef';
const PROFILE = "Profile";
const SUBJECTS = "Subjects";

const Tab = createBottomTabNavigator()



const Navigation = () => {
    const [isLoggedIn, setIsLoggedIn] = useState(true);
    const [uid, setUid] = useState();

    const onSubmit = (user) => {
        getLogin(user).then((response) => {
            if (response.status != 403) {
                setIsLoggedIn(true);
                return response.json();
            } else {
                throw new Error(`invalid login`);
            }
        })
    }

    return (
        <>
            <View style={styles.container}>
                <NavigationContainer  >
                    <Tab.Navigator
                        screenOptions={({ route }) => ({
                            tabBarIcon: () => {
                                if (route.name == PROFILE) {
                                    return <FontAwesome name="home" size={28} color="#a8cfe8" />
                                } else if (route.name == SUBJECTS) {
                                    return <FontAwesome name="book" size={28} color="#a8cfe8" />
                                }
                            }
                        })}>
                        {isLoggedIn ? (
                            <>
                                <Tab.Screen name={PROFILE} component={UserPageWrapper} initialParams={{ userId: 1 /* TODO - ъм тука трябва по някъв начин да не е така :)*/ }} options={{
                                    headerShown: false, params: {
                                        userId: 1
                                    }
                                }} />
                                <Tab.Screen name={SUBJECTS} component={SubjectsPageWrapper} initialParams={{ userId: 1 /* TODO - ъм тука трябва по някъв начин да не е така :)*/ }} options={{
                                    headerShown: false, params: {
                                        userId: 1
                                    }
                                }} />
                            </>)
                            : <Tab.Screen name="Login" component={Login}
                                initialParams={{ onSubmit: onSubmit }}
                                options={{ headerShown: false }} />
                        }
                    </Tab.Navigator>
                </NavigationContainer>
            </View>

        </>
    )
}
const styles = StyleSheet.create({
    container: {
        flex: 1
    }
})
export default Navigation;