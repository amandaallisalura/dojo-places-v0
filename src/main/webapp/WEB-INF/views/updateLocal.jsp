<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link rel="stylesheet" type="text/css" href="../../assets/css/local.css">

<main class="main">
    <h1>Atualizar dados do local: </h1>

    <div class="form-cadastro-local">
        <form:form modelAttribute="localDTO" method="post" action="/update" cssClass="form">

            <form:hidden path="id"/>

            <label>Nome:</label>
            <form:input path="name"/>
            <form:errors path="name" cssStyle="color: red"/>

            <label>Código:</label>
            <form:input path="code"/>
            <form:errors path="code" cssStyle="color: red"/>

            <label>Bairro:</label>
            <form:input path="neighborhood"/>
            <form:errors path="neighborhood" cssStyle="color: red"/>

            <label>Cidade:</label>
            <form:input path="city"/>
            <form:errors path="city" cssStyle="color: red"/>

            <form:button>Atualizar</form:button>

        </form:form>
        <script src="/assets/js/locais/buscarLocal.js"></script>
    </div>
</main>