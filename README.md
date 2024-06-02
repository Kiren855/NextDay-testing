# Giới thiệu về bài toán
Bài toán NextDay yêu cầu viết một phương thức để tính ngày kế tiếp của một ngày cho trước. Chúng tôi đã phát triển lớp “NextDay” cho bài toán và kiểm thử lớp này sử dụng JUnit để đảm bảo tính chính xác của chương trình.

# Mô tả bài toán trong mã nguồn
Lớp “NextDay” chứa phương thức “calculateNextDay(int d, int m, int y)” để tính ngày kế tiếp dựa trên ngày, tháng, và năm đã cho. Phương thức này xử lý cả năm nhuận và các tháng có số ngày khác nhau.

# kết quả kiểm thử
## Phương thức “testValidDates”:
### Mục tiêu: Kiểm tra các ngày hợp lệ.
### Chi tiết kiểm thử:
- Input và kết quả mong đợi:
- (1, 1, 2022) -> [2, 1, 2022]
- (31, 1, 2022) -> [1, 2, 2022]
- (28, 2, 2022) -> [1, 3, 2022]
- (28, 2, 2020) -> [29, 2, 2020]
- (29, 2, 2020) -> [1, 3, 2020]
- (31, 12, 2022) -> [1, 1, 2023]
- (29, 2, 2020) -> [1, 3, 2020]
- (31, 1, 2022) -> [1, 2, 2022]
- (30, 4, 2022) -> [1, 5, 2022]
- (31, 12, 2022) -> [1, 1, 2023]
### Kết quả: "Pass", tất cả các kết quả trả về đúng như mong đợi.

## Phương thức “testInvalidDates”:
### Mục tiêu: Kiểm tra các ngày không hợp lệ.
### Chi tiết kiểm thử:
- Input và kết quả mong đợi:
- (32, 1, 2022) -> IllegalArgumentException
- (30, 2, 2022) -> IllegalArgumentException
- (1, -1, 2022) -> IllegalArgumentException
- (-1, 1, 2022) -> IllegalArgumentException
- (1, 1, -2022) -> IllegalArgumentException
- (29, 2, 2021) -> IllegalArgumentException
- (0, 1, 2022) -> IllegalArgumentException
- (1, 0, 2022) -> IllegalArgumentException
- (1, 1, 0) -> IllegalArgumentException
### Kết quả: "Pass", tất cả các ngoại lệ IllegalArgumentException được ném ra như mong đợi.

## kiểm tra độ bao phủ

