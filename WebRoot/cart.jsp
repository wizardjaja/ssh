<!DOCTYPE html>
<html lang="en">
<head>	
	<title>Cart</title>
	<meta charset="utf-8" />
	
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
	<!-- GOOGLE WEB FONTS -->
	<link rel="stylesheet" href="css/font-awesome.min.css">
	
	<!-- BOOTSTRAP 3.3.7 CSS -->
	<link rel="stylesheet" href="css/bootstrap.min.css" />
	
	<!-- SLICK v1.6.0 CSS -->
	<link rel="stylesheet" href="css/slick-1.6.0/slick.css" />
	
	<link rel="stylesheet" href="css/jquery.fancybox.css" />
	<link rel="stylesheet" href="css/yith-woocommerce-compare/colorbox.css" />
	<link rel="stylesheet" href="css/owl-carousel/owl.carousel.min.css" />
	<link rel="stylesheet" href="css/owl-carousel/owl.theme.default.min.css" />
	<link rel="stylesheet" href="css/js_composer/js_composer.min.css" />
	<link rel="stylesheet" href="css/woocommerce/woocommerce.css" />
	<link rel="stylesheet" href="css/woocommerce/woocommerce-layout.css" />
	<link rel="stylesheet" href="css/woocommerce/woocommerce-smallscreen.css" />
	<link rel="stylesheet" href="css/yith-woocommerce-wishlist/style.css" />
	
	
	<link rel="stylesheet" href="css/custom.css" />
	<link rel="stylesheet" href="css/app-orange.css" id="theme_color" />
	<link rel="stylesheet" href="" id="rtl" />
	<link rel="stylesheet" href="css/app-responsive.css" /> 
</head>

<body class="page woocommerce-cart woocommerce-page">
     

	<div class="body-wrapper theme-clearfix">
		<header id="header" class="header header-style1">
			<div class="header-top clearfix">
				<div class="container">
					<div class="rows">
						<!-- SIDEBAR TOP MENU -->
						<div class="pull-left top1">
							<div class="widget text-2 widget_text pull-left">
								<div class="widget-inner">
									<div class="textwidget">
										<div class="call-us"><span>客户热线: </span>400-888-666666</div>
									</div>
								</div>
							</div>
							
							<div class="widget text-3 widget_text pull-left">
								<div class="widget-inner">
									<div class="textwidget">
										 
									</div>
								</div>
							</div>
							
							<div class="widget woocommerce_currency_converter-2 widget_currency_converter pull-left">
								<div class="widget-inner">
									 
								</div>
							</div>
						</div>
						
						<div class="wrap-myacc pull-right">
							<div class="sidebar-account pull-left">
								<div class="account-title">我的帐户</div>
                        
								<div id="my-account" class="my-account">
									<div class="widget-1 widget-first widget nav_menu-4 widget_nav_menu">
										<div class="widget-inner">
											<ul id="menu-my-account" class="menu">
												<li class="menu-my-account">
													<a class="item-link" href="my_account.html">
														<span class="menu-title">我的帐户</span>
													</a>
												</li>
												
												<li class="menu-cart">
													<a class="item-link" href="cart.html">
														<span class="menu-title">购物车</span>
													</a>
												</li>
												
												<li class="menu-checkout">
													<a class="item-link" href="checkout.html">
														<span class="menu-title">支付</span>
													</a>
												</li>
												
												<li class="menu-wishlist">
													<a class="item-link" href="#">
														<span class="menu-title">关注商品</span>
													</a>
												</li>
											</ul>
										</div>
									</div>
									
									<div class="widget-2 widget-last widget sw_top-4 sw_top">
										<div class="widget-inner">
											<div class="top-login">
												<div class="div-logined">
													<ul>
														<li>
															<a href="javascript:void(0);" data-toggle="modal" data-target="#login_form">
																<span>登录</span>
															</a>
															<span class="wg">游客</span>
														</li>
													</ul>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
							
							<div class="pull-left top2">
								<div class="widget-1 widget-first widget nav_menu-2 widget_nav_menu">
									<div class="widget-inner">
										<ul id="menu-checkout" class="menu">
											<li class="menu-checkout">
												<a class="item-link" href="checkout.html">
													<span class="menu-title">结账</span>
												</a>
											</li>
										</ul>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			
			<div class="header-mid clearfix">
				<div class="container">
					<div class="rows">
						<!-- LOGO -->
						<div class="etrostore-logo pull-left">
							<a href="#">
								<img src="images/icons/logo-orange.png" alt="Shoopy">
							</a>
						</div>
						
						<div class="mid-header pull-right">
							<div class="widget-1 widget-first widget sw_top-2 sw_top">
								<div class="widget-inner">
									<div class="top-form top-search">
										<div class="topsearch-entry">
											<form method="get" action="">
												<div>
												   <input type="text" value="" name="s" placeholder="输入搜索关键词...">	
													<div class="cat-wrapper">
														<label class="label-search">
															<select name="search_category" class="s1_option">
																<option value="">所有</option>
																<option value="8">电脑</option>
																<option value="13">网络</option>
																<option value="14">平板电脑</option>
																<option value="15">家具</option>
																<option value="16">家庭用品</option>
																<option value="17">电子配件</option>
																<option value="18">家庭用品</option>
																<option value="32">器具</option>
																<option value="49">配饰</option>
																<option value="51">电子产品</option>
																<option value="78">电视</option>
																<option value="80">相机</option>
															</select>
														</label>
													</div>
													
													<button type="submit" title="Search" class="fa fa-search button-search-pro form-button"></button>
												</div>
											</form>
										</div>
									</div>
								</div>
							</div>
							
							<div class="widget sw_top-3 sw_top pull-left">
								<div class="widget-inner">
									<div class="top-form top-form-minicart etrostore-minicart pull-right">
										<div class="top-minicart-icon pull-right">
											<i class="fa fa-shopping-cart"></i>
											<a class="cart-contents" href="cart.html" title="View your shopping cart">
												<span class="minicart-number">2</span>
											</a>
										</div>
										
										<div class="wrapp-minicart">
											<div class="minicart-padding">
												<div class="number-item"> 
													<span>购物车列表</span>
												</div>
												
												<ul class="minicart-content">
													<li>
														<a href="simple_product.html" class="product-image">
															<img 	width="100" height="100" src="images/1903/45-150x150.jpg" class="attachment-100x100 size-100x100 wp-post-image" alt="" 
																	srcset="images/1903/45-150x150.jpg 150w, images/1903/45-300x300.jpg 300w, images/1903/45-180x180.jpg 180w, images/1903/45.jpg 600w" 
																	sizes="(max-width: 100px) 100vw, 100px" />
														</a>
														
														<div class="detail-item">
															<div class="product-details">
																<h4>
																	<a class="title-item" href="simple_product.html">商品1</a>
																</h4>
																
																<div class="product-price">
																	<span class="price">
																		<span class="woocommerce-Price-amount amount">
																			<span class="woocommerce-Price-currencySymbol">$</span>190.00
																		</span>
																	</span>
																	
																	<div class="qty">
																		<span class="qty-number">1</span>									
																	</div>
																</div>
																
																<div class="product-action clearfix">
																	<a href="#" class="btn-remove" title="Remove this item">
																		<span class="fa fa-trash-o"></span>
																	</a>
																	
																	<a class="btn-edit" href="cart.html" title="View your shopping cart">
																		<span class="fa fa-pencil"></span>
																	</a>    
																</div>
															</div>
														</div>
													</li>
													
													<li>
														<a href="simple_product.html" class="product-image">
															<img 	width="100" height="100" src="images/1903/22-150x150.jpg" class="attachment-100x100 size-100x100 wp-post-image" alt="" 
																	srcset="images/1903/22-150x150.jpg 150w, images/1903/22-300x300.jpg 300w, images/1903/22-180x180.jpg 180w, images/1903/22.jpg 600w" 
																	sizes="(max-width: 100px) 100vw, 100px" />
														</a>
														
														<div class="detail-item">
															<div class="product-details">
																<h4>
																	<a class="title-item" href="simple_product.html">商品2</a>
																</h4>
																
																<div class="product-price">
																	<span class="price">
																		<span class="woocommerce-Price-amount amount">
																			<span class="woocommerce-Price-currencySymbol">$</span>350.00
																		</span>
																	</span>
																	
																	<div class="qty">
																		<span class="qty-number">1</span>									
																	</div>
																</div>
																
																<div class="product-action clearfix">
																	<a href="#" class="btn-remove" title="Remove this item">
																		<span class="fa fa-trash-o"></span>
																	</a>
																	
																	<a class="btn-edit" href="cart.html" title="View your shopping cart">
																		<span class="fa fa-pencil"></span>
																	</a>
																</div>
															</div>
														</div>
													</li>
												</ul>
												
												<div class="cart-checkout">
													<div class="price-total">
														<span class="label-price-total">Total</span>
														
														<span class="price-total-w">
															<span class="price">
																<span class="woocommerce-Price-amount amount">
																	<span class="woocommerce-Price-currencySymbol">$</span>540.00
																</span>
															</span>
														</span>			
													</div>
													
													<div class="cart-links clearfix">
														<div class="cart-link">
															<a href="cart.html" title="Cart">查看购物车</a>
														</div>
														
														<div class="checkout-link">
															<a href="checkout.html" title="Check Out">结账</a>
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
							
							<div class="widget nav_menu-3 widget_nav_menu pull-left">
								<div class="widget-inner">
									<ul id="menu-wishlist" class="menu">
										<li class="menu-wishlist">
											<a class="item-link" href="#">
												<span class="menu-title">Wishlist</span>
											</a>
										</li>
										
										<li class="yith-woocompare-open menu-compare">
											<a class="item-link compare" href="#">
												<span class="menu-title">Compare</span>
											</a>
										</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			
			<div class="header-bottom clearfix">
				<div class="container">
					<div class="rows">
						<!-- Primary navbar -->
						<!--<div id="main-menu" class="main-menu">
							<nav id="primary-menu" class="primary-menu">
								<div class="navbar-inner navbar-inverse">
									<div class="resmenu-container">
										<button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#ResMenuprimary_menu">
											<span class="sr-only">Categories</span>
											<span class="icon-bar"></span>
											<span class="icon-bar"></span>
											<span class="icon-bar"></span>
										</button>
										
										<div id="ResMenuprimary_menu" class="collapse menu-responsive-wrapper">
											<ul id="menu-primary-menu" class="etrostore_resmenu">
												<li><a href="index.html">Home</a></li>
												<li><a href="cart.html">Cart</a></li>
												<li><a href="checkout.html">Checkout</a></li>
												<li><a href="my_account.html">My Account</a></li>
												<li><a href="shop.html">Shop</a></li>
												<li><a href="simple_product.html">Simple Product</a></li>
												<li><a href="about_us.html">About Us</a></li>
												<li><a href="contact_us.html">Contact Us</a></li>
											</ul>
										</div>
									</div>
									
									<ul id="menu-primary-menu-1" class="nav nav-pills nav-mega etrostore-mega etrostore-menures">
										<li><a href="index.html">Home</a></li>
										<li><a href="cart.html">Cart</a></li>
										<li><a href="checkout.html">Checkout</a></li>
										<li><a href="my_account.html">My Account</a></li>
										<li><a href="shop.html">Shop</a></li>
										<li><a href="simple_product.html">Simple Product</a></li>
										<li><a href="about_us.html">About Us</a></li>
										<li><a href="contact_us.html">Contact Us</a></li>
									</ul>
								</div>
							</nav>
						</div>-->
						<!-- /Primary navbar -->
				  
						<div class="top-form top-form-minicart etrostore-minicart pull-right">
							<div class="top-minicart-icon pull-right">
								<i class="fa fa-shopping-cart"></i>
								<a class="cart-contents" href="cart.html" title="View your shopping cart">
									<span class="minicart-number">2</span>
								</a>
							</div>
						 
							<div class="wrapp-minicart">
								<div class="minicart-padding">
									<div class="number-item">
										There are <span>items</span> in your cart
									</div>
									
									<ul class="minicart-content">
										<li>
											<a href="simple_product.html" class="product-image">
												<img 	width="100" height="100" src="images/1903/45-150x150.jpg" class="attachment-100x100 size-100x100 wp-post-image" alt="" 
														srcset="images/1903/45-150x150.jpg 150w, images/1903/45-300x300.jpg 300w, images/1903/45-180x180.jpg 180w, images/1903/45.jpg 600w" 
														sizes="(max-width: 100px) 100vw, 100px" />
											</a>
											
											<div class="detail-item">
												<div class="product-details">
													<h4>
														<a class="title-item" href="simple_product.html">Veniam Dolore</a>
													</h4>
													
													<div class="product-price">
														<span class="price">														
															<span class="woocommerce-Price-amount amount">
																<span class="woocommerce-Price-currencySymbol">$</span>190.00
															</span>
														</span>	      
														
														<div class="qty">
															<span class="qty-number">1</span>									
														</div>
													</div>
													
													<div class="product-action clearfix">
														<a href="#" class="btn-remove" title="Remove this item">
															<span class="fa fa-trash-o"></span>
														</a>
														
														<a class="btn-edit" href="cart.html" title="View your shopping cart">
															<span class="fa fa-pencil"></span>
														</a>    
													</div>
												</div>
											</div>
										</li>
									  
										<li>
											<a href="simple_product.html" class="product-image">
												<img	 width="100" height="100" src="images/1903/22-150x150.jpg" class="attachment-100x100 size-100x100 wp-post-image" alt="" 
														srcset="images/1903/22-150x150.jpg 150w, images/1903/22-300x300.jpg 300w, images/1903/22-180x180.jpg 180w, images/1903/22.jpg 600w" 
														sizes="(max-width: 100px) 100vw, 100px" />
											</a>
											
											<div class="detail-item">
												<div class="product-details">
													<h4>
														<a class="title-item" href="simple_product.html">Cleaner with bag</a>
													</h4>
													
													<div class="product-price">
														<span class="price">
															<span class="woocommerce-Price-amount amount">
																<span class="woocommerce-Price-currencySymbol">$</span>350.00
															</span>
														</span>
														
														<div class="qty">
															<span class="qty-number">1</span>									
														</div>
													</div>
													
													<div class="product-action clearfix">
														<a href="#" class="btn-remove" title="Remove this item">
															<span class="fa fa-trash-o"></span>
														</a>           
														
														<a class="btn-edit" href="cart.html" title="View your shopping cart">
															<span class="fa fa-pencil"></span>
														</a>
													</div>
												</div>
											</div>
										</li>
									</ul>
									
									<div class="cart-checkout">
										<div class="price-total">
											<span class="label-price-total">Total</span>
											
											<span class="price-total-w">
												<span class="price">
													<span class="woocommerce-Price-amount amount">
														<span class="woocommerce-Price-currencySymbol">$</span>540.00
													</span>
												</span>
											</span>			
										</div>
										
										<div class="cart-links clearfix">
											<div class="cart-link">
												<a href="cart.html" title="Cart">View Cart</a>
											</div>
											
											<div class="checkout-link">
												<a href="checkout.html" title="Check Out">Check Out</a>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
				  
						<div class="mid-header pull-right">
							<div class="widget sw_top">
								<span class="stick-sr">
									<i class="fa fa-search" aria-hidden="true"></i>
								</span>
								
								<div class="top-form top-search">
									<div class="topsearch-entry">
										<form role="search" method="get" class="form-search searchform" action="">
											<label class="hide"></label>
											<input type="text" value="" name="s" class="search-query" placeholder="Keyword here..." />
											<button type="submit" class="button-search-pro form-button">Search</button>
										</form>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</header>
		
		<div class="listings-title">
			<div class="container">
				<div class="wrap-title">
					<h1>我的购物车</h1>
					<div class="bread">
						<div class="breadcrumbs theme-clearfix">
							<div class="container">
								<ul class="breadcrumb">
									<li>
										<a href="#">Home</a>
										<span class="go-page"></span>
									</li>
									
									<li class="active">
										<span>Cart</span>
									</li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>			
		</div>
		
		<div class="container">
			<div class="row">
				<div id="contents" role="main" class="main-page col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<div class="page type-page status-publish hentry">
						<div class="entry-content">
							<div class="entry-summary">
								<div class="woocommerce">
									<form action="" method="post">
										<table class="shop_table shop_table_responsive cart" cellspacing="0">
											<thead>
												<tr>
													<th class="product-remove">&nbsp;</th>
													<th class="product-thumbnail">&nbsp;</th>
													<th class="product-name">商品名称</th>
													<th class="product-price">价格</th>
													<th class="product-quantity">数量</th>
													<th class="product-subtotal">总价</th>
												</tr>
											</thead>
											
											<tbody>
												<tr class="cart_item">
													<td class="product-remove">
														<a href="#" class="remove" title="Remove this item"><i class="fa fa-times" aria-hidden="true"></i></a>					
													</td>
													
													<td class="product-thumbnail">
														<a href="simple_product.html">
															<img width="180" height="180" src="images/1903/56-180x180.jpg" class="attachment-shop_thumbnail size-shop_thumbnail wp-post-image" alt="" srcset="images/1903/56-180x180.jpg 180w, images/1903/56-150x150.jpg 150w, images/1903/56-300x300.jpg 300w, images/1903/56.jpg 600w" sizes="(max-width: 180px) 100vw, 180px">
														</a>
													</td>
													
													<td class="product-name" data-title="Product">
														<a href="simple_product.html">Enim eu kevin</a>					
													</td>
													
													<td class="product-price" data-title="Price">
														<span class="woocommerce-Price-amount amount"><span class="woocommerce-Price-currencySymbol">$</span>300.00</span>					
													</td>
													
													<td class="product-quantity" data-title="Quantity">
														<div class="quantity">
															<input type="number" step="1" min="0" max="" name="" value="1" title="Qty" class="input-text qty text" size="4" pattern="[0-9]*" inputmode="numeric">
														</div>
													</td>
													
													<td class="product-subtotal" data-title="Total">
														<span class="woocommerce-Price-amount amount"><span class="woocommerce-Price-currencySymbol">$</span>300.00</span>					
													</td>
												</tr>
												
												<tr>
													 
												</tr>
											</tbody>
										</table>
									</form>
								
									<div class="cart-collaterals">
										<div class="products-wrapper">
											<div class="cart_totals ">
												<h2>总价</h2>
												
												<table cellspacing="0" class="shop_table shop_table_responsive">
													<tbody>
														<tr class="cart-subtotal">
															<th>Subtotal</th>
															<td data-title="单价">
																<span class="woocommerce-Price-amount amount"><span class="woocommerce-Price-currencySymbol">$</span>300.00</span>
															</td>
														</tr>
														<tr class="order-total">
															<th>Total</th>
															<td data-title="总价">
																<strong><span class="woocommerce-Price-amount amount"><span class="woocommerce-Price-currencySymbol">$</span>300.00</span></strong> 
															</td>
														</tr>
													</tbody>
												</table>
												
												<div class="wc-proceed-to-checkout">
													<a href="checkout.html" class="checkout-button button alt wc-forward">结账</a>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						
						<div class="clearfix"></div>
					</div>
				</div>
			</div>
		</div>
		
		<footer id="footer" class="footer default theme-clearfix">
			<!-- Content footer -->
			<div class="container"> 
			</div>
			
			<div class="footer-copyright style1">
				<div class="container">
					<!-- Copyright text -->
					<div class="copyright-text pull-left">
						<p>Copyright &copy; 2017.All rights reserved.</p>
					</div>
					
					<div class="sidebar-copyright pull-right">
						 
					</div>
				</div>
			</div>
		</footer>
	</div>
   
	<!-- DIALOGS -->
	<div class="modal fade" id="search_form" tabindex="-1" role="dialog" aria-hidden="true">
		<div class="modal-dialog block-popup-search-form">
			<form role="search" method="get" class="form-search searchform" action="">
				<input type="text" value="" name="s" class="search-query" placeholder="Enter your keyword..." />
				
				<button type="submit" class="fa fa-search button-search-pro form-button"></button>
				
				<a href="javascript:void(0)" title="Close" class="close close-search" data-dismiss="modal">X</a>
			</form>
		</div>
	</div>
	
   <div class="modal fade" id="login_form" tabindex="-1" role="dialog" aria-hidden="true">
		<div class="modal-dialog block-popup-login">
			<a href="javascript:void(0)" title="Close" class="close close-login" data-dismiss="modal">Close</a>
         
			<div class="tt_popup_login">
				<strong>Sign in Or Register</strong>
			</div>
         
			<form action="" method="post" class="login">
				<div class="block-content">
					<div class="col-reg registered-account">
						<div class="email-input">
							<input type="text" class="form-control input-text username" name="username" id="username" placeholder="Username" />
						</div>
						
						<div class="pass-input">
							<input class="form-control input-text password" type="password" placeholder="Password" name="password" id="password" />
						</div>
						
						<div class="ft-link-p">
							<a href="#" title="Forgot your password">Forgot your password?</a>
						</div>
						
						<div class="actions">
							<div class="submit-login">
								<input type="submit" class="button btn-submit-login" name="login" value="Login" />
							</div>
						</div>
					</div>
					
					<div class="col-reg login-customer">
						<h2>NEW HERE?</h2>
						
						<p class="note-reg">Registration is free and easy!</p>
						
						<ul class="list-log">
							<li>Faster checkout</li>
							
							<li>Save multiple shipping addresses</li>
							
							<li>View and track orders and more</li>
						</ul>
						
						<a href="create_account.html" title="Register" class="btn-reg-popup">Create an account</a>
					</div>
				</div>
			</form>
			<div class="clear"></div>
		</div>
	</div>
	
	<a id="etrostore-totop" href="#"></a>	
	
	<div id="subscribe_popup" class="subscribe-popup" style="background: url(images/icons/bg_newsletter.jpg)">
		<div class="subscribe-popup-container">
			<h2>Join our newsletter</h2>
			<div class="description">Subscribe now to get 40% of on any product!</div>
			<div class="subscribe-form">
				<form id="mc4wp-form-2" class="mc4wp-form mc4wp-form-275" method="post" data-id="275" data-name="">
					<div class="mc4wp-form-fields">
						<div class="newsletter-content">
							<input type="email" class="newsletter-email" name="EMAIL" placeholder="Your email" required="" />
							<input class="newsletter-submit" type="submit" value="Subscribe" />
						</div>
					</div>
					<div class="mc4wp-response"></div>
				</form>		
			</div>
			
			<div class="subscribe-checkbox">
				<label for="popup_check">
					<input id="popup_check" name="popup_check" type="checkbox" />
					<span>Don't show this popup again!</span>
				</label>
			</div>
			
			<div class="subscribe-social">
				<div class="subscribe-social-inner">
					<a href="#" class="social-fb">
						<span class="fa fa-facebook"></span>
					</a>
					
					<a href="#" class="social-tw">
						<span class="fa fa-twitter"></span>
					</a>
					
					<a href="#" class="social-gplus">
						<span class="fa fa-google-plus"></span>
					</a>
					
					<a href="#" class="social-pin">
						<span class="fa fa-instagram"></span>
					</a>
					
					<a href="#" class="social-linkedin">
						<span class="fa fa-pinterest-p"></span>
					</a>				
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="js/jquery/jquery.min.js"></script>
	<script type="text/javascript" src="js/jquery/jquery-migrate.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/jquery/js.cookie.min.js"></script>
	
	<!-- OPEN LIBS JS -->
	<script type="text/javascript" src="js/owl-carousel/owl.carousel.min.js"></script>
	<script type="text/javascript" src="js/slick-1.6.0/slick.min.js"></script>
	
	<script type="text/javascript" src="js/yith-woocommerce-compare/jquery.colorbox-min.js"></script>
	<script type="text/javascript" src="js/sw_core/isotope.js"></script>
	<script type="text/javascript" src="js/sw_core/jquery.fancybox.pack.js"></script>
	<script type="text/javascript" src="js/sw_woocommerce/category-ajax.js"></script>
	<script type="text/javascript" src="js/sw_woocommerce/jquery.countdown.min.js"></script>
	<script type="text/javascript" src="js/wc-quantity-increment.min.js"></script>
	<script type="text/javascript" src="js/woocommerce/cart.min.js"></script>
	<script type="text/javascript" src="js/js_composer/js_composer_front.min.js"></script>
	
	<script type="text/javascript" src="js/plugins.js"></script>
	<script type="text/javascript" src="js/megamenu.min.js"></script>
	<script type="text/javascript" src="js/main.min.js"></script>
   
	<script type="text/javascript">
		var sticky_navigation_offset_top = $("#header .header-bottom").offset().top;
		var sticky_navigation = function(){
									var scroll_top = $(window).scrollTop();
									if (scroll_top > sticky_navigation_offset_top) {
										$("#header .header-bottom").addClass("sticky-menu");
										$("#header .header-bottom").css({ "top":0, "left":0, "right" : 0 });
									} else {
										$("#header .header-bottom").removeClass("sticky-menu");
									}
								};
		sticky_navigation();
		$(window).scroll(function() {
			sticky_navigation();
		});
		
		$(document).ready (function () {
			$( ".show-dropdown" ).each(function(){
				$(this).on("click", function(){
					$(this).toggleClass("show");
					var $element = $(this).parent().find( "> ul" );
					$element.toggle( 300 );
				});
			});
		});
   </script>
   
   <!--[if gte IE 9]><!-->
   <script type="text/javascript">
		var request, b = document.body, c = 'className', cs = 'customize-support', rcs = new RegExp('(^|\\s+)(no-)?'+cs+'(\\s+|$)');
		request = true;
      
      	b[c] = b[c].replace( rcs, ' ' );
      	// The customizer requires postMessage and CORS (if the site is cross domain)
      	b[c] += ( window.postMessage && request ? ' ' : ' no-' ) + cs;
   </script>
   <!--<![endif]-->
   </body>
</html>

