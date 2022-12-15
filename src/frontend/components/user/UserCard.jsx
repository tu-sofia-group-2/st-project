import { StyleSheet, Text, View, Image, ScrollView, Dimensions} from 'react-native'
import React from 'react'

import FormattedText from '../util/FormattedText'
const { width, height } = Dimensions.get('window')

export default function UserCard({user}) {
    return (
        <View>
            <View style={styles.header}>
                <Image
                    style={styles.profilePicture}
                    source={require('../../assets/john.png')}
                    resizeMode="contain"
                />
            </View>
            <ScrollView
            alwaysBounceVertical 
            showsHorizontalScrollIndicator={false} 
            showsVerticalScrollIndicator={false}
                style={{height: height * 0.65} }
            >
                <View style={styles.data}>
                    <Text>Име : </Text>
                    <FormattedText text={user.name}/>
                </View>
                <View style={styles.data}>
                    <Text>Факултетен номер : </Text>
                    <FormattedText text={user.userId}/>
                </View>
                <View style={styles.data}>
                    <Text>Факултет : </Text>
                    <FormattedText text={user.faculty}/>
                </View>
                <View style={styles.data}>
                    <Text>Специалност : </Text>
                    <FormattedText text={user.program}/>
                </View>
                <View style={styles.data}>
                    <Text>Вид обучение : </Text>
                    <FormattedText text={user.formOfEducation}/>
                </View>
                <View style={styles.data}>
                    <Text>Прием : </Text>
                    <FormattedText text={user.priem}/>
                </View>
                <View style={styles.data}>
                    <Text>ОКС : </Text>
                    <FormattedText text={user.OKS}/>
                </View>
                <View style={styles.data}>
                    <Text>Имейл : </Text>
                    <FormattedText text={user.email}/>
                </View>
                <View style={styles.data}>
                    <Text>Състояние : </Text>
                    <FormattedText text={user.status}/>
                </View>
                <View style={styles.data}>
                    <Text>Записан семестър : </Text>
                    <FormattedText text={user.semester}/>
                </View>
                <View style={styles.data}>
                    <Text>Заверен семестър : </Text>
                    <FormattedText text={user.certifiedSem}/>
                </View>
                <View style={styles.data}>
                    <Text>Поток : </Text>
                    <FormattedText text={user.subgroup}/>
                </View>
                <View style={styles.data}>
                    <Text>Група : </Text>
                    <FormattedText text={user.group}/>
                </View>
                <View style={styles.data}>
                    <Text>Основна специалност : </Text>
                    <FormattedText text={user.mainPr}/>
                </View>
                <View style={styles.data}>
                    <Text>Имейл в ТУ : </Text>
                    <FormattedText text={user.tusmail}/>
                </View>
            </ScrollView>
        </View>
    )
}

const styles = StyleSheet.create({
    container:{
        flex:1,
        flexDirection:"column",
        alignItems:"center",
        justifyContent:"flex-start"
    },
    container: {
        flex: 1,
      },
      scrollView: {
        marginHorizontal: 20,
      },
    profilePicture:{
        width: 160,
        height: 160,
        borderRadius: 80,
    },
    header:{
        width:"100%",
        height: height * 0.3,
        backgroundColor: "#a8cfe8",
        alignItems: "center",
        justifyContent: "center"
    }, 
    data:{
        width:"100%",
        height:70,
        borderBottomColor:"#a8cfe8",
        borderBottomWidth:3,
        marginLeft:10,
    },
})