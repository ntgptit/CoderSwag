package com.giapnt.coderswag.services

import com.giapnt.coderswag.model.Category
import com.giapnt.coderswag.model.Story

class DataServices {
    val categories = listOf(
        Category("Kiếm hiệp", "kiemHiepImage" ),
        Category("Viễn tưởng", "vienTuongImage" ),
        Category("Hài hước", "haiHuocImage" ),
        Category("Tiên hiệp", "tienHiepImage" ),
        Category("Kinh dị", "kinhDiImage" )
    )

    val storiesSwordHero = listOf(
        Story("Anh Hùng Xạ Điêu", "Kim Dung", "", "ahxdImage"),
        Story("Thần Điêu Đại Hiệp", "Kim Dung", "", "tddhImage"),
        Story("Ỷ Thiên Đồ Long Ký", "Kim Dung", "", "ytdlkImage"),
    )

    val storiesFiction = listOf(
        Story("Harry Potter và hòn đá phù thủy", "J. K. Rowling", "", "hp&hdptImage"),
        Story("Harry Potter và phòng chứa bí mật", "J. K. Rowling", "", "hp&pcbmImage"),
        Story("Harry Potter và tên tù nhân ngục Azkaban", "J. K. Rowling", "", "hp&ttnnaImage"),
        Story("Harry Potter và chiếc cốc lửa", "J. K. Rowling", "", "hp&cclImage"),
        Story("Harry Potter và mật lệnh Phượng Hoàng", "J. K. Rowling", "", "hp&mlphImage"),
        Story("Harry Potter và Hoàng tử lai", "J. K. Rowling", "", "hp&htlImage"),
        Story("Harry Potter và bảo bối tử thần", "J. K. Rowling", "", "hp&bbttImage"),
    )

    val storiesFairyHero= listOf(
        Story("Huyền Thiên Hồn Tôn ", "Ám Ma Sư", "", "hthtImage"),
        Story("Phàm Nhân Tu Tiên", "Vong Ngữ", "", "pnttImage"),
        Story("Ta Tu Có Thể Là Giả Tiên", "Minh Nguyệt Địa Thượng Sương", "", "ttctlgtImage"),
    )
}