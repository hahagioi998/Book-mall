/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-08-26 06:13:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class item_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        function qq(value,name){\r\n");
      out.write("        \t\r\n");
      out.write("\t        $.post(\"/item/seek/\"+name,{value : value});\r\n");
      out.write("\t        $(\"#itemList\").datagrid(\"reload\");\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("    <input id=\"ss\" class=\"easyui-searchbox\" style=\"width:300px\"\r\n");
      out.write("        data-options=\"searcher:qq,prompt:'Please Input Value',menu:'#mm'\"></input>\r\n");
      out.write("    <div id=\"mm\" style=\"width:120px\">\r\n");
      out.write("        <div data-options=\"name:'bookName',iconCls:'icon-ok'\">书名</div>\r\n");
      out.write("        <div data-options=\"name:'author',iconCls:'icon-man'\">作者</div>\r\n");
      out.write("    </div>\r\n");
      out.write("<table class=\"easyui-datagrid\" id=\"itemList\" title=\"图书列表\" \r\n");
      out.write("       data-options=\"singleSelect:false,collapsible:true,pagination:true,url:'/item/list',method:'get',pageSize:30,toolbar:toolbar\">\r\n");
      out.write("    <thead>\r\n");
      out.write("        <tr>\r\n");
      out.write("        \t<th data-options=\"field:'ck',checkbox:true\"></th>\r\n");
      out.write("        \t<th data-options=\"field:'id',width:130\">图书ID</th>\r\n");
      out.write("            <th data-options=\"field:'bookName',width:200\">图书名称</th>\r\n");
      out.write("            <th data-options=\"field:'cid',width:60\">叶子类目</th>\r\n");
      out.write("            <th data-options=\"field:'author',width:100\">作者</th>\r\n");
      out.write("            <th data-options=\"field:'sellPoint',width:300\">卖点</th>\r\n");
      out.write("            <th data-options=\"field:'price',width:70,align:'right',formatter:TAOTAO.formatPrice\">价格</th>\r\n");
      out.write("            <th data-options=\"field:'num',width:70,align:'right'\">库存数量</th>\r\n");
      out.write("            <th data-options=\"field:'status',width:60,align:'center',formatter:TAOTAO.formatItemStatus\">状态</th>\r\n");
      out.write("            <th data-options=\"field:'created',width:130,align:'center',formatter:TAOTAO.formatDateTime\">创建日期</th>\r\n");
      out.write("            <th data-options=\"field:'updated',width:130,align:'center',formatter:TAOTAO.formatDateTime\">更新日期</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("</table>\r\n");
      out.write("<div id=\"itemEditWindow\" class=\"easyui-window\" title=\"编辑商品\" data-options=\"modal:true,closed:true,iconCls:'icon-save',href:'/rest/page/item-edit'\" style=\"width:80%;height:80%;padding:10px;\">\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("    function getSelectionsIds(){\r\n");
      out.write("    \tvar itemList = $(\"#itemList\");\r\n");
      out.write("    \tvar sels = itemList.datagrid(\"getSelections\");\r\n");
      out.write("    \tvar ids = [];\r\n");
      out.write("    \tfor(var i in sels){\r\n");
      out.write("    \t\tids.push(sels[i].id);\r\n");
      out.write("    \t}\r\n");
      out.write("    \tids = ids.join(\",\");\r\n");
      out.write("    \treturn ids;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    var toolbar = [{\r\n");
      out.write("        text:'新增',\r\n");
      out.write("        iconCls:'icon-add',\r\n");
      out.write("        handler:function(){\r\n");
      out.write("        \t$(\".tree-title:contains('新增图书')\").parent().click();\r\n");
      out.write("        }\r\n");
      out.write("    },{\r\n");
      out.write("        text:'编辑',\r\n");
      out.write("        iconCls:'icon-edit',\r\n");
      out.write("        handler:function(){\r\n");
      out.write("        \tvar ids = getSelectionsIds();\r\n");
      out.write("        \tif(ids.length == 0){\r\n");
      out.write("        \t\t$.messager.alert('提示','必须选择一个商品才能编辑!');\r\n");
      out.write("        \t\treturn ;\r\n");
      out.write("        \t}\r\n");
      out.write("        \tif(ids.indexOf(',') > 0){\r\n");
      out.write("        \t\t$.messager.alert('提示','只能选择一个商品!');\r\n");
      out.write("        \t\treturn ;\r\n");
      out.write("        \t}\r\n");
      out.write("        \t\r\n");
      out.write("        \t$(\"#itemEditWindow\").window({\r\n");
      out.write("        \t\tonLoad :function(){\r\n");
      out.write("        \t\t\t//回显数据\r\n");
      out.write("        \t\t\tvar data = $(\"#itemList\").datagrid(\"getSelections\")[0];\r\n");
      out.write("        \t\t\tdata.priceView = TAOTAO.formatPrice(data.price);\r\n");
      out.write("        \t\t\t$(\"#itemeEditForm\").form(\"load\",data);\r\n");
      out.write("        \t\t\t\r\n");
      out.write("        \t\t\t// 加载商品描述\r\n");
      out.write("        \t\t\t$.getJSON('/rest/item/query/item/desc/'+data.id,function(_data){\r\n");
      out.write("        \t\t\t\tif(_data.status == 200){\r\n");
      out.write("        \t\t\t\t\t//UM.getEditor('itemeEditDescEditor').setContent(_data.data.itemDesc, false);\r\n");
      out.write("        \t\t\t\t\titemEditEditor.html(_data.data.bookDesc);\r\n");
      out.write("        \t\t\t\t}\r\n");
      out.write("        \t\t\t});\r\n");
      out.write("        \t\t\tTAOTAO.init({\r\n");
      out.write("        \t\t\t\t\"pics\" : data.image,\r\n");
      out.write("        \t\t\t\t\"cid\" : data.cid,\r\n");
      out.write("        \t\t\t\tfun:function(node){\r\n");
      out.write("        \t\t\t\t\tTAOTAO.changeItemParam(node, \"itemeEditForm\");\r\n");
      out.write("        \t\t\t\t}\r\n");
      out.write("        \t\t\t});\r\n");
      out.write("        \t\t}\r\n");
      out.write("        \t}).window(\"open\");\r\n");
      out.write("        }\r\n");
      out.write("    },{\r\n");
      out.write("        text:'删除',\r\n");
      out.write("        iconCls:'icon-cancel',\r\n");
      out.write("        handler:function(){\r\n");
      out.write("        \tvar ids = getSelectionsIds();\r\n");
      out.write("        \tif(ids.length == 0){\r\n");
      out.write("        \t\t$.messager.alert('提示','未选中商品!');\r\n");
      out.write("        \t\treturn ;\r\n");
      out.write("        \t}\r\n");
      out.write("        \t$.messager.confirm('确认','确定删除ID为 '+ids+' 的商品吗？',function(r){\r\n");
      out.write("        \t    if (r){\r\n");
      out.write("        \t    \tvar params = {\"ids\":ids};\r\n");
      out.write("                \t$.post(\"/rest/item/delete\",params, function(data){\r\n");
      out.write("            \t\t\tif(data.status == 200){\r\n");
      out.write("            \t\t\t\t$.messager.alert('提示','删除商品成功!',undefined,function(){\r\n");
      out.write("            \t\t\t\t\t$(\"#itemList\").datagrid(\"reload\");\r\n");
      out.write("            \t\t\t\t});\r\n");
      out.write("            \t\t\t}\r\n");
      out.write("            \t\t});\r\n");
      out.write("        \t    }\r\n");
      out.write("        \t});\r\n");
      out.write("        }\r\n");
      out.write("    },'-',{\r\n");
      out.write("        text:'下架',\r\n");
      out.write("        iconCls:'icon-remove',\r\n");
      out.write("        handler:function(){\r\n");
      out.write("        \tvar ids = getSelectionsIds();\r\n");
      out.write("        \tif(ids.length == 0){\r\n");
      out.write("        \t\t$.messager.alert('提示','未选中商品!');\r\n");
      out.write("        \t\treturn ;\r\n");
      out.write("        \t}\r\n");
      out.write("        \t$.messager.confirm('确认','确定下架ID为 '+ids+' 的商品吗？',function(r){\r\n");
      out.write("        \t    if (r){\r\n");
      out.write("        \t    \tvar params = {\"ids\":ids};\r\n");
      out.write("                \t$.post(\"/rest/item/instock\",params, function(data){\r\n");
      out.write("            \t\t\tif(data.status == 200){\r\n");
      out.write("            \t\t\t\t$.messager.alert('提示','下架商品成功!',undefined,function(){\r\n");
      out.write("            \t\t\t\t\t$(\"#itemList\").datagrid(\"reload\");\r\n");
      out.write("            \t\t\t\t});\r\n");
      out.write("            \t\t\t}\r\n");
      out.write("            \t\t});\r\n");
      out.write("        \t    }\r\n");
      out.write("        \t});\r\n");
      out.write("        }\r\n");
      out.write("    },{\r\n");
      out.write("        text:'上架',\r\n");
      out.write("        iconCls:'icon-remove',\r\n");
      out.write("        handler:function(){\r\n");
      out.write("        \tvar ids = getSelectionsIds();\r\n");
      out.write("        \tif(ids.length == 0){\r\n");
      out.write("        \t\t$.messager.alert('提示','未选中商品!');\r\n");
      out.write("        \t\treturn ;\r\n");
      out.write("        \t}\r\n");
      out.write("        \t$.messager.confirm('确认','确定上架ID为 '+ids+' 的商品吗？',function(r){\r\n");
      out.write("        \t    if (r){\r\n");
      out.write("        \t    \tvar params = {\"ids\":ids};\r\n");
      out.write("                \t$.post(\"/rest/item/reshelf\",params, function(data){\r\n");
      out.write("            \t\t\tif(data.status == 200){\r\n");
      out.write("            \t\t\t\t$.messager.alert('提示','上架商品成功!',undefined,function(){\r\n");
      out.write("            \t\t\t\t\t$(\"#itemList\").datagrid(\"reload\");\r\n");
      out.write("            \t\t\t\t});\r\n");
      out.write("            \t\t\t}\r\n");
      out.write("            \t\t});\r\n");
      out.write("        \t    }\r\n");
      out.write("        \t});\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    ];\r\n");
      out.write("</script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
