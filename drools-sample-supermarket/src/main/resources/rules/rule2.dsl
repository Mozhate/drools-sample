/*
[when]存在订单=$o:Order()
[when]存在配置=$d:Disconfig()
[when]满足配置条件=$sum:Integer(doubleValue>$d.getMoney()) from accumulate(Item($money:money) from $o.getItems(),sum($money))

[then]计算结果=$o.setMoney($sum);
           $o.setPreferential($d.getPreferential());
           $o.setActual($o.getMoney()-$o.getPreferential());
*/