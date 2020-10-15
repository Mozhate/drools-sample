/*
[when]存在配置=$discount:Discount()
[when]存在订单且满足优惠=$order:Order(money>=$discount.getMoney())

[then]进行结算=$order.setPreferential($discount.getPreferential());
               $order.setActual($order.getMoney()-$order.getPreferential());
               System.out.println("满减优惠");
*/