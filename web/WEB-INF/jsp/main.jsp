<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach items="${persons}" var="person">
      <c:out value="${person.firstName} + ' ' + ${person.lastName}"/>
</c:forEach>