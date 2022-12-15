import { StyleSheet, Text, View } from 'react-native'
import React from 'react'

import UserCard from '../components/user/UserCard'

const dummyUser = {
    name: "John Constantine",
    email: "john@testmail.com",
    img: "https://images.alphacoders.com/566/thumb-1920-566243.jpg",
    userId: "121220169",
    faculty: "KST",
    program: "KSI",
    formOfEducation: 'redovno',
    OKS: "bakalavar",
}

export default function Profile() {
    return (
        <View>
            <UserCard user={dummyUser}/>
        </View>
  )
}

const styles = StyleSheet.create({})