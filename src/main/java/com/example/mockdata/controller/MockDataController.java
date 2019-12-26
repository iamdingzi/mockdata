package com.example.mockdata.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MockDataController {


    //获取价态
    @PostMapping("getHotelDetails")
    public String hotelRooms(@RequestBody String req) {
        System.out.println(req);
        return "{\n" +
                "    \"Hotel\": {\n" +
                "        \"CityCode\": \"710100\",\n" +
                "        \"CurrencyCode\": \"CNY\",\n" +
                "        \"HotelCode\": \"895709066000\",\n" +
                "        \"CheckOut\": \"2020-01-04\",\n" +
                "        \"RoomTypes\": [\n" +
                "            {\n" +
                "                \"RoomTypeEnglishName\": \"行政豪华客房\",\n" +
                "                \"RoomTypeName\": \"行政豪华客房\",\n" +
                "                \"RateInfos\": [\n" +
                "                    {\n" +
                "                        \"TotalTaxAndFee\": 0,\n" +
                "                        \"TotalBasePrice\": 3796,\n" +
                "                        \"RateName\": \"标准价\",\n" +
                "                        \"Refundable\": false,\n" +
                "                        \"RateKey\": \"N_89570906_20379293_100844224298\",\n" +
                "                        \"RateEnglishName\": \"标准价\",\n" +
                "                        \"CurrencyCode\": \"CNY\",\n" +
                "                        \"RateCode\": \"N_89570906_20379293_100844224298\",\n" +
                "                        \"Board\": {\n" +
                "                            \"BoardCount\": 0,\n" +
                "                            \"BoardCode\": \"No\"\n" +
                "                        },\n" +
                "                        \"MaxChildren\": 0,\n" +
                "                        \"MaxOccupancy\": 2,\n" +
                "                        \"TotalPrice\": 3796,\n" +
                "                        \"PaymentType\": 1,\n" +
                "                        \"Allotment\": 1,\n" +
                "                        \"RateComments\": {\n" +
                "                            \"RateComment\": [\n" +
                "                                \"根据酒店所在地当地法规，您可能还需在酒店支付额外税费。\\u003cb\\u003e国籍提示\\u003c/b\\u003e\\u003cul\\u003e\\u003cli\\u003e该价格仅适用于中国大陆的客人。\\u003c/li\\u003e\\u003c/ul\\u003e\"\n" +
                "                            ]\n" +
                "                        }\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"RoomTypeCode\": \"20379293\",\n" +
                "                \"MaxRoomOccupancy\": 2\n" +
                "            },\n" +
                "            {\n" +
                "                \"RoomTypeEnglishName\": \"行政豪华客房\",\n" +
                "                \"RoomTypeName\": \"行政豪华客房\",\n" +
                "                \"RateInfos\": [\n" +
                "                    {\n" +
                "                        \"TotalTaxAndFee\": 0,\n" +
                "                        \"TotalBasePrice\": 3779,\n" +
                "                        \"RateName\": \"标准价\",\n" +
                "                        \"Refundable\": false,\n" +
                "                        \"RateKey\": \"N_89570906_20379293_100844635342\",\n" +
                "                        \"RateEnglishName\": \"标准价\",\n" +
                "                        \"CurrencyCode\": \"CNY\",\n" +
                "                        \"RateCode\": \"N_89570906_20379293_100844635342\",\n" +
                "                        \"Board\": {\n" +
                "                            \"BoardCount\": 0,\n" +
                "                            \"BoardCode\": \"No\"\n" +
                "                        },\n" +
                "                        \"MaxChildren\": 0,\n" +
                "                        \"MaxOccupancy\": 2,\n" +
                "                        \"TotalPrice\": 3779,\n" +
                "                        \"PaymentType\": 1,\n" +
                "                        \"Allotment\": 1,\n" +
                "                        \"RateComments\": {\n" +
                "                            \"RateComment\": [\n" +
                "                                \"根据酒店所在地当地法规，您可能还需在酒店支付额外税费。\\u003cb\\u003e国籍提示\\u003c/b\\u003e\\u003cul\\u003e\\u003cli\\u003e该价格仅适用于中国大陆的客人。\\u003c/li\\u003e\\u003c/ul\\u003e\"\n" +
                "                            ]\n" +
                "                        }\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"RoomTypeCode\": \"20379293\",\n" +
                "                \"MaxRoomOccupancy\": 2\n" +
                "            },\n" +
                "            {\n" +
                "                \"RoomTypeEnglishName\": \"豪华客房\",\n" +
                "                \"RoomTypeName\": \"豪华客房\",\n" +
                "                \"RateInfos\": [\n" +
                "                    {\n" +
                "                        \"TotalTaxAndFee\": 0,\n" +
                "                        \"TotalBasePrice\": 2576,\n" +
                "                        \"RateName\": \"标准价\",\n" +
                "                        \"Refundable\": false,\n" +
                "                        \"RateKey\": \"N_89570906_20379291_100844224299\",\n" +
                "                        \"RateEnglishName\": \"标准价\",\n" +
                "                        \"CurrencyCode\": \"CNY\",\n" +
                "                        \"RateCode\": \"N_89570906_20379291_100844224299\",\n" +
                "                        \"Board\": {\n" +
                "                            \"BoardCount\": 0,\n" +
                "                            \"BoardCode\": \"No\"\n" +
                "                        },\n" +
                "                        \"MaxChildren\": 0,\n" +
                "                        \"MaxOccupancy\": 2,\n" +
                "                        \"TotalPrice\": 2576,\n" +
                "                        \"PaymentType\": 1,\n" +
                "                        \"Allotment\": 1,\n" +
                "                        \"RateComments\": {\n" +
                "                            \"RateComment\": [\n" +
                "                                \"根据酒店所在地当地法规，您可能还需在酒店支付额外税费。\\u003cb\\u003e国籍提示\\u003c/b\\u003e\\u003cul\\u003e\\u003cli\\u003e该价格仅适用于中国大陆的客人。\\u003c/li\\u003e\\u003c/ul\\u003e\"\n" +
                "                            ]\n" +
                "                        }\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"RoomTypeCode\": \"20379291\",\n" +
                "                \"MaxRoomOccupancy\": 2\n" +
                "            },\n" +
                "            {\n" +
                "                \"RoomTypeEnglishName\": \"豪华客房\",\n" +
                "                \"RoomTypeName\": \"豪华客房\",\n" +
                "                \"RateInfos\": [\n" +
                "                    {\n" +
                "                        \"TotalTaxAndFee\": 0,\n" +
                "                        \"TotalBasePrice\": 2564,\n" +
                "                        \"RateName\": \"标准价\",\n" +
                "                        \"Refundable\": false,\n" +
                "                        \"RateKey\": \"N_89570906_20379291_100844696417\",\n" +
                "                        \"RateEnglishName\": \"标准价\",\n" +
                "                        \"CurrencyCode\": \"CNY\",\n" +
                "                        \"RateCode\": \"N_89570906_20379291_100844696417\",\n" +
                "                        \"Board\": {\n" +
                "                            \"BoardCount\": 0,\n" +
                "                            \"BoardCode\": \"No\"\n" +
                "                        },\n" +
                "                        \"MaxChildren\": 0,\n" +
                "                        \"MaxOccupancy\": 2,\n" +
                "                        \"TotalPrice\": 2564,\n" +
                "                        \"PaymentType\": 1,\n" +
                "                        \"Allotment\": 1,\n" +
                "                        \"RateComments\": {\n" +
                "                            \"RateComment\": [\n" +
                "                                \"根据酒店所在地当地法规，您可能还需在酒店支付额外税费。\\u003cb\\u003e国籍提示\\u003c/b\\u003e\\u003cul\\u003e\\u003cli\\u003e该价格仅适用于中国大陆的客人。\\u003c/li\\u003e\\u003c/ul\\u003e\"\n" +
                "                            ]\n" +
                "                        }\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"RoomTypeCode\": \"20379291\",\n" +
                "                \"MaxRoomOccupancy\": 2\n" +
                "            }\n" +
                "        ],\n" +
                "        \"PaymentType\": 1,\n" +
                "        \"CheckIn\": \"2020-01-03\",\n" +
                "        \"Name\": \"台北文华东方酒店\",\n" +
                "        \"EnglishName\": \"台北文华东方酒店\",\n" +
                "        \"MinPrice\": 500,\n" +
                "        \"MinTaxPrice\": 0\n" +
                "    }\n" +
                "}";
    }
    //可定检查
    @PostMapping("check")
    public String check(@RequestBody String req) {
        System.out.println(req);
        return "{\"Hotel\":{\"CityCode\":\"810100\",\"CurrencyCode\":\"CNY\",\"HotelCode\":\"23297216000\",\"CheckOut\":\"2019-12-27\",\"RoomTypes\":[{\"RoomTypeEnglishName\":\"都会高级客房\",\"RoomTypeName\":\"都会高级客房\",\"RateInfos\":[{\"TotalTaxAndFee\":0,\"TotalBasePrice\":182,\"RateName\":\"标准价\",\"Refundable\":false,\"RateKey\":\"N_2329721_23449533_101227667778\",\"RateEnglishName\":\"标准价\",\"CurrencyCode\":\"CNY\",\"RateCode\":\"N_2329721_23449533_101227667778\",\"Board\":{\"BoardCount\":0,\"BoardCode\":\"No\"},\"MaxChildren\":0,\"MaxOccupancy\":1,\"TotalPrice\":182,\"PaymentType\":1,\"Allotment\":1,\"RateComments\":{\"RateComment\":[\"根据酒店所在地当地法规，您可能还需在酒店支付额外税费。\"]},\"refundableJson\":\"-refundable:1-cpApply:[]\"}],\"RoomTypeCode\":\"23449533\",\"MaxRoomOccupancy\":1}],\"PaymentType\":1,\"CheckIn\":\"2019-12-26\",\"Name\":\"帆船精品酒店\",\"EnglishName\":\"帆船精品酒店\",\"MinPrice\":500,\"MinTaxPrice\":0},\"Error\":{\"Code\":\"CHECK_ORDER_SUCCESS\",\"Message\":\"可定检查成功\"}}";
    }
    //下单
    @PostMapping("order")
    public String order(@RequestBody String req) {
        System.out.println(req);
        return "{\"TaoBaoOrderId\":\"577837540252854698\",\"Error\":{\"Code\":\"WAIT_CONFIRM_ORDER\",\"Message\":\"待确认\"}}";
    }
    //取消
    public String cancel(@RequestBody String req) {
        System.out.println(req);
        return "";
    }
}
