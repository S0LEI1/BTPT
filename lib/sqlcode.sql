USE [PhanCongCongViec]
GO
/****** Object:  Table [dbo].[CongViec]    Script Date: 10/27/2022 10:07:49 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CongViec](
	[MaCongViec] [int] IDENTITY(1,1) NOT NULL,
	[HanChot] [date] NULL,
	[NgayNhanCongViec] [date] NULL,
	[TenCongViec] [nvarchar](30) NOT NULL,
	[TrangThai] [nvarchar](30) NULL,
	[MaDuAn] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaCongViec] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DuAn]    Script Date: 10/27/2022 10:07:49 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DuAn](
	[MaDuAn] [int] IDENTITY(1,1) NOT NULL,
	[NgayGiao] [date] NULL,
	[NgayHoanThanh] [date] NULL,
	[TenDuAn] [nvarchar](50) NOT NULL,
	[MaNguoiQuanLy] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaDuAn] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 10/27/2022 10:07:49 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[MaNhanVien] [int] IDENTITY(1,1) NOT NULL,
	[HoVaTen] [nvarchar](30) NOT NULL,
	[NgaySinh] [date] NULL,
	[SDT] [varchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaNhanVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVienCOngViec]    Script Date: 10/27/2022 10:07:49 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVienCOngViec](
	[MaCongViec] [int] NOT NULL,
	[MaNhanVien] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaCongViec] ASC,
	[MaNhanVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVienLapTrinh]    Script Date: 10/27/2022 10:07:49 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVienLapTrinh](
	[NgonNguLapTrinh] [nvarchar](50) NULL,
	[MaNhanVien] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaNhanVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[QuanLyDuAn]    Script Date: 10/27/2022 10:07:49 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[QuanLyDuAn](
	[SoNamKinhNghiem] [int] NULL,
	[MaNhanVien] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaNhanVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 10/27/2022 10:07:49 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[TenDangNhap] [varchar](255) NOT NULL,
	[MatKhau] [varchar](255) NULL,
	[MaNhanVien] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[TenDangNhap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY],
 CONSTRAINT [UK_c7k0868x5s8jnlrwrydcsvm0i] UNIQUE NONCLUSTERED 
(
	[MaNhanVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[CongViec]  WITH CHECK ADD  CONSTRAINT [FKbkv58mtuotpbtwnoafu8iqpvq] FOREIGN KEY([MaDuAn])
REFERENCES [dbo].[DuAn] ([MaDuAn])
GO
ALTER TABLE [dbo].[CongViec] CHECK CONSTRAINT [FKbkv58mtuotpbtwnoafu8iqpvq]
GO
ALTER TABLE [dbo].[DuAn]  WITH CHECK ADD  CONSTRAINT [FKhfnih6nqh7vc9sss3uy5ar7lq] FOREIGN KEY([MaNguoiQuanLy])
REFERENCES [dbo].[QuanLyDuAn] ([MaNhanVien])
GO
ALTER TABLE [dbo].[DuAn] CHECK CONSTRAINT [FKhfnih6nqh7vc9sss3uy5ar7lq]
GO
ALTER TABLE [dbo].[NhanVienCOngViec]  WITH CHECK ADD  CONSTRAINT [FKfhtix21l2mg0m5afe3bk5fx1c] FOREIGN KEY([MaNhanVien])
REFERENCES [dbo].[NhanVienLapTrinh] ([MaNhanVien])
GO
ALTER TABLE [dbo].[NhanVienCOngViec] CHECK CONSTRAINT [FKfhtix21l2mg0m5afe3bk5fx1c]
GO
ALTER TABLE [dbo].[NhanVienCOngViec]  WITH CHECK ADD  CONSTRAINT [FKlbyv5990tkmdpynkgrxu9jmqo] FOREIGN KEY([MaCongViec])
REFERENCES [dbo].[CongViec] ([MaCongViec])
GO
ALTER TABLE [dbo].[NhanVienCOngViec] CHECK CONSTRAINT [FKlbyv5990tkmdpynkgrxu9jmqo]
GO
ALTER TABLE [dbo].[NhanVienLapTrinh]  WITH CHECK ADD  CONSTRAINT [FKrl8mduf4rsimn38gvsrkqwyx3] FOREIGN KEY([MaNhanVien])
REFERENCES [dbo].[NhanVien] ([MaNhanVien])
GO
ALTER TABLE [dbo].[NhanVienLapTrinh] CHECK CONSTRAINT [FKrl8mduf4rsimn38gvsrkqwyx3]
GO
ALTER TABLE [dbo].[QuanLyDuAn]  WITH CHECK ADD  CONSTRAINT [FKnkbebf7964j93vl0rfscqd95l] FOREIGN KEY([MaNhanVien])
REFERENCES [dbo].[NhanVien] ([MaNhanVien])
GO
ALTER TABLE [dbo].[QuanLyDuAn] CHECK CONSTRAINT [FKnkbebf7964j93vl0rfscqd95l]
GO
ALTER TABLE [dbo].[TaiKhoan]  WITH CHECK ADD  CONSTRAINT [FKf08970nqaug3otfu2giqkxveu] FOREIGN KEY([MaNhanVien])
REFERENCES [dbo].[NhanVien] ([MaNhanVien])
GO
ALTER TABLE [dbo].[TaiKhoan] CHECK CONSTRAINT [FKf08970nqaug3otfu2giqkxveu]
GO
