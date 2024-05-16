package com.example.demo;

public enum Prefecture {
    HOKKAIDO("北海道", "札幌市"),
    AOMORI("青森県", "青森市"),
    IWATE("岩手県", "盛岡市"),
    MIYAGI("宮城県", "仙台市"),
    AKITA("秋田県", "秋田市"),
    YAMAGATA("山形県", "山形市"),
    FUKUSHIMA("福島県", "福島市"),
    IBARAKI("茨城県", "水戸市"),
    TOCHIGI("栃木県", "宇都宮市"),
    GUNMA("群馬県", "前橋市"),
    SAITAMA("埼玉県", "さいたま市"),
    CHIBA("千葉県", "千葉市"),
    TOKYO("東京都", "東京"),
    KANAGAWA("神奈川県", "横浜市"),
    NIIGATA("新潟県", "新潟市"),
    TOYAMA("富山県", "富山市"),
    ISHIKAWA("石川県", "金沢市"),
    FUKUI("福井県", "福井市"),
    YAMANASHI("山梨県", "甲府市"),
    NAGANO("長野県", "長野市"),
    GIFU("岐阜県", "岐阜市"),
    SHIZUOKA("静岡県", "静岡市"),
    AICHI("愛知県", "名古屋市"),
    MIE("三重県", "津市"),
    SHIGA("滋賀県", "大津市"),
    KYOTO("京都府", "京都市"),
    OSAKA("大阪府", "大阪市"),
    HYOGO("兵庫県", "神戸市"),
    NARA("奈良県", "奈良市"),
    WAKAYAMA("和歌山県", "和歌山市"),
    TOTTORI("鳥取県", "鳥取市"),
    SHIMANE("島根県", "松江市"),
    OKAYAMA("岡山県", "岡山市"),
    HIROSHIMA("広島県", "広島市"),
    YAMAGUCHI("山口県", "山口市"),
    TOKUSHIMA("徳島県", "徳島市"),
    KAGAWA("香川県", "高松市"),
    EHIME("愛媛県", "松山市"),
    KOCHI("高知県", "高知市"),
    FUKUOKA("福岡県", "福岡市"),
    SAGA("佐賀県", "佐賀市"),
    NAGASAKI("長崎県", "長崎市"),
    KUMAMOTO("熊本県", "熊本市"),
    OITA("大分県", "大分市"),
    MIYAZAKI("宮崎県", "宮崎市"),
    KAGOSHIMA("鹿児島県", "鹿児島市"),
    OKINAWA("沖縄県", "那覇市");

    private final String prefectureName;
    private final String capital;

    Prefecture(String prefectureName, String capital) {
        this.prefectureName = prefectureName;
        this.capital = capital;
    }

    public String getPrefectureName() {
        return prefectureName;
    }

    public String getCapital() {
        return capital;
    }
}
