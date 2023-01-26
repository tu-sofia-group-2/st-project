import React from "react";
import { FlatList, View, ActivityIndicator } from "react-native";
import SubjectBarMinimised from "./SubjectBarMinimised";

const SubjectsList = ({ data, onPress, index, type }) => {

    const renderItem = ({ item }) => {
        return <SubjectBarMinimised
            name={item.name}
            labs={item.labs}
            lectures={item.lectures}
            seminars={item.seminars}
            project={item.project}
            courseWork={item.courseWork}
            onPress={onPress}
            index={index}
            type={type}
            subIndex={item.id}
            keyExtractor={item.id}
            key={item.id}
        />
    }

    return (<View>
        {!data ?
            <ActivityIndicator size="large" /> :
            <FlatList
                data={data}
                renderItem={renderItem}
                keyExtractor={item => item.id}
            />
        }
    </View>)
}

export default SubjectsList;