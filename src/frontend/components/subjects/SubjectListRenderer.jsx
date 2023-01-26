import React from "react";
import { View, ActivityIndicator, FlatList } from "react-native";
import { LEFT } from "../../constants/SeperatorTypesEnum";
import Seperator from "../util/Seperator";
import SubjectsList from "./SubjectsList";

const SubjectListRenderer = ({ data, type, onPress }) => {

    const renderItem = ({ item }) => {
        return <View>
            <Seperator text={item.header} type={LEFT} color="gray" />
            <SubjectsList data={item.subjects} index={item.id} type={type} onPress={onPress} />
        </View>
    }

    //  tuk data idva za malko pravilna i posle stava prazno?
    return (<View style={{ width: "100%" }}>
        {console.log("tuk sum sled student", data)}
        {!data ?
            <ActivityIndicator size="large" /> :
            <FlatList
                data={data}
                renderItem={item => renderItem(item)}
                keyExtractor={item => item.id}
                showsVerticalScrollIndicator={false}
                showsHorizontalScrollIndicator={false}
                key={item => item.id}
            />
        }
    </View>)

}

export default SubjectListRenderer;

