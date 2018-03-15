
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object basket extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Customer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.products._


Seq[Any](format.raw/*1.35*/("""


"""),format.raw/*7.1*/("""
"""),format.raw/*8.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*9.2*/main("Shopping Basket", customer)/*9.35*/ {_display_(Seq[Any](format.raw/*9.37*/("""


"""),format.raw/*12.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*15.4*/if(flash.containsKey("success"))/*15.36*/ {_display_(Seq[Any](format.raw/*15.38*/("""
			  """),format.raw/*16.6*/("""<div class="alert alert-success">
			      """),_display_(/*17.11*/flash/*17.16*/.get("success")),format.raw/*17.31*/("""
			  """),format.raw/*18.6*/("""</div>
		""")))}),format.raw/*19.4*/(""" 
        """),_display_(/*20.10*/if(flash.containsKey("error"))/*20.40*/ {_display_(Seq[Any](format.raw/*20.42*/("""
            """),format.raw/*21.13*/("""<p class="alert alert-warning">
                """),_display_(/*22.18*/flash/*22.23*/.get("error")),format.raw/*22.36*/("""
            """),format.raw/*23.13*/("""</p>
        """)))}),format.raw/*24.10*/("""
		"""),format.raw/*25.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Item Price</th>
				<th>Total</th>
				<th>Quantity</th>
                <th>dec.</th>
                <th>inc.</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*39.18*/if(customer.getBasket() != null)/*39.50*/ {_display_(Seq[Any](format.raw/*39.52*/("""
                    """),format.raw/*40.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*41.22*/for(i <- customer.getBasket().getBasketItems()) yield /*41.69*/ {_display_(Seq[Any](format.raw/*41.71*/("""
                    """),format.raw/*42.21*/("""<tr>
                        <td>"""),_display_(/*43.30*/i/*43.31*/.getProduct.getName),format.raw/*43.50*/("""</td>
                        <td>"""),_display_(/*44.30*/i/*44.31*/.getProduct.getDescription()),format.raw/*44.59*/("""</td>
                        <td>&euro; """),_display_(/*45.37*/("%.2f".format(i.getPrice))),format.raw/*45.64*/("""</td>
                        <td>&euro; """),_display_(/*46.37*/("%.2f".format(i.getItemTotal))),format.raw/*46.68*/("""</td>
                        <td>"""),_display_(/*47.30*/i/*47.31*/.getQuantity()),format.raw/*47.45*/("""</td>
                        <td><a href=""""),_display_(/*48.39*/routes/*48.45*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*48.77*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                        <td><a href=""""),_display_(/*49.39*/routes/*49.45*/.ShoppingCtrl.addOne(i.getId)),format.raw/*49.74*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
                    </tr>
                    """)))}),format.raw/*51.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*52.16*/("""
			"""),format.raw/*53.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*57.69*/("%.2f".format(customer.getBasket.getBasketTotal))),format.raw/*57.119*/("""</strong></p>
            </div>  
        </div>
        <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*63.31*/routes/*63.37*/.ShoppingCtrl.emptyBasket()),format.raw/*63.64*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                </p>
            </div>  
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*69.31*/routes/*69.37*/.ShoppingCtrl.placeOrder()),format.raw/*69.63*/("""" class="btn btn-success btn-sm">
                    <span class="glyphicon glyphicon-euro"></span> Place Order</a>
                </p>
            </div>  
        </div>
    </div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*79.24*/("""{"""),format.raw/*79.25*/("""
		"""),format.raw/*80.3*/("""return confirm('Are you sure?');
	"""),format.raw/*81.2*/("""}"""),format.raw/*81.3*/("""
"""),format.raw/*82.1*/("""</script>
""")))}))
      }
    }
  }

  def render(customer:models.users.Customer): play.twirl.api.HtmlFormat.Appendable = apply(customer)

  def f:((models.users.Customer) => play.twirl.api.HtmlFormat.Appendable) = (customer) => apply(customer)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 13 19:34:46 GMT 2018
                  SOURCE: C:/Users/User/Documents/lab5/app/views/basket.scala.html
                  HASH: 0288bf8f8b98cc0e2c8ac78224d8930112158b69
                  MATRIX: 964->1|1070->38|1106->68|1138->94|1192->34|1221->119|1248->120|1319->166|1360->199|1399->201|1429->204|1502->251|1543->283|1583->285|1616->291|1687->335|1701->340|1737->355|1770->361|1810->371|1848->382|1887->412|1927->414|1968->427|2044->476|2058->481|2092->494|2133->507|2178->521|2208->524|2562->851|2603->883|2643->885|2692->906|2802->989|2865->1036|2905->1038|2954->1059|3015->1093|3025->1094|3065->1113|3127->1148|3137->1149|3186->1177|3255->1219|3303->1246|3372->1288|3424->1319|3486->1354|3496->1355|3531->1369|3602->1413|3617->1419|3670->1451|3799->1553|3814->1559|3864->1588|4005->1698|4076->1738|4107->1742|4284->1892|4356->1942|4563->2122|4578->2128|4626->2155|4948->2450|4963->2456|5010->2482|5337->2781|5366->2782|5396->2785|5457->2819|5485->2820|5513->2821
                  LINES: 28->1|31->4|32->5|33->6|36->1|39->7|40->8|41->9|41->9|41->9|44->12|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|52->20|52->20|52->20|53->21|54->22|54->22|54->22|55->23|56->24|57->25|71->39|71->39|71->39|72->40|73->41|73->41|73->41|74->42|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|78->46|78->46|79->47|79->47|79->47|80->48|80->48|80->48|81->49|81->49|81->49|83->51|84->52|85->53|89->57|89->57|95->63|95->63|95->63|101->69|101->69|101->69|111->79|111->79|112->80|113->81|113->81|114->82
                  -- GENERATED --
              */
          