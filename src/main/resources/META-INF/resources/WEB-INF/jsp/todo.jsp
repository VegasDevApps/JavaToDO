
<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<div class="container">
    <h1>Enter Todo Details</h1>
    <form:form method="POST" modelAttribute="todo">
        <fieldSet class="mb-3">
            <form:label path="description">Description: </form:label>
            <form:input type="text" name="description" required="required" path="description" />
            <form:errors path="description" cssClass="text-warning" />
        </fieldSet>

        <fieldSet class="mb-3">
            <form:label path="targetDate">Target Date: </form:label>
            <form:input type="text" name="targetDate" required="required" path="targetDate" />
            <form:errors path="targetDate" cssClass="text-warning" />
        </fieldSet>

        <form:input type="hidden"  path="done" />
        <form:input type="hidden"  path="id" />
        <br>
        <input type="submit" class="btn btn-success"/>
    </form:form>
</div>
<%@ include file="common/footer.jspf" %>
 <script type="text/javascript">
    $('#targetDate').datepicker({
        format: 'yyyy-mm-dd'
    });
</script>

