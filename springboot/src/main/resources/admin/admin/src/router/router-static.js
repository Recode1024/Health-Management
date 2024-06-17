import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import aboutus from '@/views/modules/aboutus/list'
    import jiankangshuju from '@/views/modules/jiankangshuju/list'
    import dakakaoqin from '@/views/modules/dakakaoqin/list'
    import heshuijilu from '@/views/modules/heshuijilu/list'
    import storeup from '@/views/modules/storeup/list'
    import yinshixinxi from '@/views/modules/yinshixinxi/list'
    import yundongleixing from '@/views/modules/yundongleixing/list'
    import forum from '@/views/modules/forum/list'
    import zhishifenlei from '@/views/modules/zhishifenlei/list'
    import yundongjilu from '@/views/modules/yundongjilu/list'
    import yinshileixing from '@/views/modules/yinshileixing/list'
    import systemintro from '@/views/modules/systemintro/list'
    import yonghu from '@/views/modules/yonghu/list'
    import shuimianjilu from '@/views/modules/shuimianjilu/list'
    import bushujilu from '@/views/modules/bushujilu/list'
    import config from '@/views/modules/config/list'
    import jiankangkepu from '@/views/modules/jiankangkepu/list'
    import newstype from '@/views/modules/newstype/list'


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
      ,{
	path: '/aboutus',
        name: '关于我们',
        component: aboutus
      }
      ,{
	path: '/jiankangshuju',
        name: 'BMI值计算',
        component: jiankangshuju
      }
      ,{
	path: '/dakakaoqin',
        name: '打卡考勤',
        component: dakakaoqin
      }
      ,{
	path: '/heshuijilu',
        name: '喝水记录',
        component: heshuijilu
      }
      ,{
	path: '/storeup',
        name: '我的收藏',
        component: storeup
      }
      ,{
	path: '/yinshixinxi',
        name: '饮食信息',
        component: yinshixinxi
      }
      ,{
	path: '/yundongleixing',
        name: '运动类型',
        component: yundongleixing
      }
      ,{
	path: '/forum',
        name: '交流论坛',
        component: forum
      }
      ,{
	path: '/zhishifenlei',
        name: '知识分类',
        component: zhishifenlei
      }
      ,{
	path: '/yundongjilu',
        name: '运动记录',
        component: yundongjilu
      }
      ,{
	path: '/yinshileixing',
        name: '饮食类型',
        component: yinshileixing
      }
      ,{
	path: '/systemintro',
        name: '系统简介',
        component: systemintro
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/shuimianjilu',
        name: '睡眠记录',
        component: shuimianjilu
      }
      ,{
	path: '/bushujilu',
        name: '步数记录',
        component: bushujilu
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/jiankangkepu',
        name: '健康科普',
        component: jiankangkepu
      }
      ,{
	path: '/newstype',
        name: '公告信息分类',
        component: newstype
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
