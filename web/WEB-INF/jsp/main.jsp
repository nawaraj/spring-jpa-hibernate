<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach items="${contacts}" var="person">
      <c:out value="${person.firstName} + ' ' + ${person.lastName}"/>
</c:forEach>