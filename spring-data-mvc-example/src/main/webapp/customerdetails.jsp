<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
    <h2>SpringData MVC example</h2>
 
        <form action="customer/save" method="post">
            <label for="name">Customer Name</label>
            <input type="text" id="name" name="name"/>
                        <label for="address">Customer Address</label>
            <input type="text" id="address" name="address"/>
            
            <input type="submit" value="Submit"/>
        </form>
 
    <table border="2">
        <c:forEach var="customer" items="${customerList}">
            <tr>
                <td>${customer.name}</td>
                <td>${customer.address}</td>
                
            </tr>
        </c:forEach>
    </table>  
</body>
</html>