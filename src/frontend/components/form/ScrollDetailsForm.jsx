import React from "react";
import { ScrollView } from "react-native-gesture-handler";

const ScrollDetailsForm = ({entries, header}) => {
    return<View>
        <Text>
            {header}
        </Text>
    <ScrollView>
        {entries.map((e)=>{

        })}
    </ScrollView>
    </View> 
}