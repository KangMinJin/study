<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>To do list</title>
    <link rel="stylesheet" href="./style.css">
</head>
<body>
    <div class="heading">
        <h2>To do list</h2>
    </div>

    <form method="POST" action ="index.php">
        <input type="text" name="task" class="task_input">
        <button type="submit" class="add_btn" name="submit">Add task</button>
    </form>

    <table>
        <thead>
            <tr>
                <th>N</th>
                <th>Task</th>
                <th>Action</th>
            </tr>
        </thead>

        <tbody>
            <tr>
                <td>1</td>
                <td>first task</td>
            </tr>
        </tbody>
    </table>
</body>
</html>