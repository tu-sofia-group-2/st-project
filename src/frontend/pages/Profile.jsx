import { StyleSheet, Text, View } from 'react-native'
import React from 'react'

import UserCard from '../components/user/UserCard'

const dummyUser = {
    name: "John Constantine",
    email: "john@testmail.com",
    img: "../assets/john.png",
    userId: "121220169",
    faculty: "KST",
    program: "KSI",
    formOfEducation: 'in person',
    OKS: "Bachelors",
    priem:"DP",
    status:"active",
    semester:"4",
    certifiedSem:"3",
    group:"77",
    subgroup:"16",
    mainPr:"yes",
    tusmail:"jconstantine@tu-sofia.bg"

}

export default function Profile() {
    return (
        <View>
            <UserCard user={dummyUser}/>
        </View>
  )
}

const styles = StyleSheet.create({})