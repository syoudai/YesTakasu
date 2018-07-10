<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ImageUploader</title>
    </head>
    <body>
            <Div Align="center">
        <h1>画像のアップロード</h1>
            <form method="POST" action="FileUploadDbServlet" enctype="multipart/form-data">
                <table>
                    <tr>
                        <td>ファイル名: </td>
                        <td><input type="text" name="name" size="30" /></td>
                    </tr>
                    <tr>
                        <td>画像 : </td>
                        <td><input type="file" name="image" size="30" /></td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="submit" value="送信">
                        </td>
                    </tr>
                </table>
                <br><br>
            </form>
            <input type="button" value="show"  onclick="location.href='ShowImage'" style="WIDTH:100px; HEIGHT:50px">
         </Div>
    </body>
</html>
