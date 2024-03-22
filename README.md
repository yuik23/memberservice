# 第８回課題 Read処理の実装
## 概要
- DockerでMysqlのローカル環境を構築した。
- MybatisでDB接続を行い、塾の会員管理データベースを作成、操作可能なAPIをSpringBootで実装した。

### ①Read処理の実装
以下のテーブルを作成し、レコードを全件取得するAPIを実装する
![img.png](img.png)
namesテーブルではid、名前、生年月日、入会日、所属する学校、学年を管理する。

### ②クエリ文字を指定して検索するAPIの実装
school_name column で接尾文字「小学校or中学校」と grade column で学年を指定して同学年の会員を検索するAPIを実装する.
