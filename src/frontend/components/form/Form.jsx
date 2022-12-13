import React from "react";
import { FlatList, StyleSheet , View} from "react-native";
import { DATA_TYPE_ARRAY, DATA_TYPE_VALUE, LAYOUT_COL, LAYOUT_ROW } from "../../constants/FormInputDataJsonType";
import ScrollDetailsFormElement from "./ScrollDetailsFormElement";


const Form = ({data, direction}) => {
    const horizontal = (direction === LAYOUT_ROW ? true : false);
    // const styleRowCol = (direction === LAYOUT_ROW ? styles.row : styles.col);
    // const generatedStyle = StyleSheet.compose(styleRowCol, styles.container);


    const mapData = (e) => {
            const dir = (direction === LAYOUT_ROW ? LAYOUT_COL : LAYOUT_ROW)
            if(e.type === DATA_TYPE_VALUE) {
                return <ScrollDetailsFormElement
                            label = {e.data.label}
                            value = {e.data.value}
                        />
            } else if (e.type === DATA_TYPE_ARRAY) {
                return <Form data={e.data} direction={dir}/>
            } else {
                return null;
            }
    }

    return (<View style={styles.container}>
        <FlatList
            horizontal={horizontal}
            data={data}
            keyExtractor= {(e)=>e.key}
            renderItem = {(e)=>mapData(e.item)}
        />
    </View>)
 }

 const styles = StyleSheet.create({
    container: {
        display: "flex",
        height: "100%",
        paddingTop: 2,
        elevation: 2
    },
    row:{
        flexDirection: "row"
    },
    col: {
        flexDirection: "column"
    }
 });

 Form.defaultProps = {
    direction : LAYOUT_COL
 }
 
 export default Form;