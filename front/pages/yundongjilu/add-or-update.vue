<template>
<view class="content">
	<view :style='{"minHeight":"100vh","width":"100%","padding":"24rpx","position":"relative","background":"#F1F1F1","height":"auto"}'>
		<form :style='{"width":"100%","padding":"24rpx","borderRadius":"16rpx","background":"#fff","display":"block","height":"auto"}' class="app-update-pv">
			<view :style='{"padding":"0px 24rpx","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">运动地点</view>
				<input :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.yundongdidian" v-model="ruleForm.yundongdidian" placeholder="运动地点"  type="text"></input>
			</view>
			<view :style='{"padding":"0px 24rpx","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="" @tap="yundongtupianTap">
				<view :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">运动图片</view>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-if="ruleForm.yundongtupian" :src="baseUrl+ruleForm.yundongtupian.split(',')[0]" mode="aspectFill"></image>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
			</view>
			<view :style='{"padding":"0px 24rpx","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">运动类型</view>
				<picker :disabled="ro.yundongleixing" :style='{"border":"2rpx solid #fff","width":"100%","padding":"0 24rpx","flex":"1","background":"rgba(255,255,255,.6)","height":"auto"}' @change="yundongleixingChange" :value="yundongleixingIndex" :range="yundongleixingOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666"}' class="uni-input">{{yundongleixingOptions[yundongleixingIndex]}}</view>
				</picker>
			</view>
			<view :style='{"padding":"0px 24rpx","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">开始时间</view>
				<input :disabled="ro.kaishishijian" :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}' v-model="ruleForm.kaishishijian" placeholder="开始时间" @tap="toggleTab('kaishishijian')"></input>
			</view>
			<view :style='{"padding":"0px 24rpx","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">结束时间</view>
				<input :disabled="ro.jieshushijian" :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}' v-model="ruleForm.jieshushijian" placeholder="结束时间" @tap="toggleTab('jieshushijian')"></input>
			</view>
			<view :style='{"padding":"0px 24rpx","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">卡路里/小时</view>
				<input :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}' disabled v-model="ruleForm.kaluli" placeholder="卡路里/小时"></input>
			</view>
			<view :style='{"padding":"0px 24rpx","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">运动时长</view>
				<input :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}' disabled v-model="yundongshizhang" placeholder="运动时长"></input>
			</view>
			<view :style='{"padding":"0px 24rpx","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">总消耗</view>
				<input :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}' disabled v-model="zongxiaohao" placeholder="总消耗"></input>
			</view>
			<view :style='{"padding":"0px 24rpx","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">运动时间</view>
				<picker  :disabled="ro.yundongshijian" :style='{"border":"2rpx solid #fff","width":"100%","padding":"0 24rpx","flex":"1","background":"rgba(255,255,255,.6)","height":"auto"}' mode="date" :value="ruleForm.yundongshijian" @change="yundongshijianChange">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666"}' class="uni-input">{{ruleForm.yundongshijian?ruleForm.yundongshijian:"请选择运动时间"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"0px 24rpx","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">用户账号</view>
				<input :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.yonghuzhanghao" v-model="ruleForm.yonghuzhanghao" placeholder="用户账号"  type="text"></input>
			</view>
			<view :style='{"padding":"0px 24rpx","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">用户姓名</view>
				<input :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.yonghuxingming" v-model="ruleForm.yonghuxingming" placeholder="用户姓名"  type="text"></input>
			</view>
 

			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","borderWidth":"0 0 2rpx 0","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"margin":"0 0 0 24rpx","color":"#999","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","minWidth":"160rpx","fontWeight":"500"}' class="title">运动情况</view>
                <xia-editor ref="editor" :style='{"border":"2rpx solid #fff","minHeight":"360rpx","padding":"20rpx","color":"#666","borderRadius":"8rpx","background":"rgba(255,255,255,.6)","width":"100%","height":"auto"}' v-model="ruleForm.yundongqingkuang" placeholder="运动情况" @editorChange="yundongqingkuangChange"></xia-editor>
			</view>
			
			<view :style='{"width":"100%","flexWrap":"wrap","justifyContent":"center","display":"flex","height":"auto"}' class="btn" >
				<button :style='{"border":"0","padding":"0px","margin":"0 40rpx 40rpx 0","color":"#fff","borderRadius":"60rpx","background":"#F6BE1E","width":"40%","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

		<w-picker  mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="kaishishijianConfirm" ref="kaishishijian" themeColor="#333333"></w-picker>
		<w-picker  mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="jieshushijianConfirm" ref="jieshushijian" themeColor="#333333"></w-picker>
	</view>
</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";
    import xiaEditor from '@/components/xia-editor/xia-editor';
    import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
				cross:'',
				ruleForm: {
				yundongdidian: '',
				yundongtupian: '',
				yundongleixing: '',
				kaishishijian: '',
				jieshushijian: '',
				kaluli: '',
				yundongshizhang: '',
				zongxiaohao: '',
				yundongshijian: '',
				yundongqingkuang: '',
				yonghuzhanghao: '',
				yonghuxingming: '',
				shhf: '',
				},
				yundongleixingOptions: [],
				yundongleixingIndex: 0,
				// 登录用户信息
				user: {},
                ro:{
                   yundongdidian : false,
                   yundongtupian : false,
                   yundongleixing : false,
                   kaishishijian : false,
                   jieshushijian : false,
                   kaluli : false,
                   yundongshizhang : false,
                   zongxiaohao : false,
                   yundongshijian : false,
                   yundongqingkuang : false,
                   yonghuzhanghao : false,
                   yonghuxingming : false,
                   sfsh : false,
                   shhf : false,
                },
			}
		},
		components: {
			wPicker,
            xiaEditor,
            multipleSelect,
		},
		computed: {
			yundongshizhang : {
				get: function () {
					let h = this.ruleForm
					let a = 'h.kaishishijian-h.jieshushijian'
					let n = a.split('-')
					let hour = this.getHour(h[n[0].split('h.')[1]], h[n[1].split('h.')[1]])
					this.ruleForm.yundongshizhang = hour?hour:0
					return hour?hour:0
				}
				
			},
			zongxiaohao : {
				get: function () {
					let c = this.ruleForm
					let a = c.yundongshizhang*c.kaluli
					this.ruleForm.zongxiaohao = a?Number(a).toFixed(2):0
					return a?Number(a).toFixed(2):0
				}
				
			},
			baseUrl() {
				return this.$base.url;
			},



		},
		async onLoad(options) {
            this.ruleForm.kaishishijian =  this.$utils.getCurDateTime();
            this.ruleForm.jieshushijian =  this.$utils.getCurDateTime();
            this.ruleForm.yundongshijian = this.$utils.getCurDate();
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取
			this.ruleForm.yonghuzhanghao = this.user.yonghuzhanghao
			this.ro.yonghuzhanghao = true;
			this.ruleForm.yonghuxingming = this.user.yonghuxingming
			this.ro.yonghuxingming = true;

            this.ro.yundongtupian = true;
            this.ro.jieshushijian = true;
            this.ro.yundongshizhang = true;

			// 下2
			res = await this.$api.option(`yundongleixing`,`yundongleixing`,{});
			this.yundongleixingOptions = res.data;

			// 如果有登录，获取登录后保存的userid
			this.ruleForm.userid = uni.getStorageSync("appUserid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = Number(options.refid);
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`yundongjilu`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='yundongdidian'){
					this.ruleForm.yundongdidian = obj[o];
					this.ro.yundongdidian = true;
					continue;
					}
					if(o=='yundongtupian'){
					this.ruleForm.yundongtupian = obj[o].split(",")[0];
					this.ro.yundongtupian = true;
					continue;
					}
					if(o=='yundongleixing'){
					this.ruleForm.yundongleixing = obj[o];
					this.ro.yundongleixing = true;
					continue;
					}
					if(o=='kaishishijian'){
					this.ruleForm.kaishishijian = obj[o];
					this.ro.kaishishijian = true;
					continue;
					}
					if(o=='jieshushijian'){
					this.ruleForm.jieshushijian = obj[o];
					this.ro.jieshushijian = true;
					continue;
					}
					if(o=='kaluli'){
					this.ruleForm.kaluli = obj[o];
					this.ro.kaluli = true;
					continue;
					}
					if(o=='yundongshizhang'){
					this.ruleForm.yundongshizhang = obj[o];
					this.ro.yundongshizhang = true;
					continue;
					}
					if(o=='zongxiaohao'){
					this.ruleForm.zongxiaohao = obj[o];
					this.ro.zongxiaohao = true;
					continue;
					}
					if(o=='yundongshijian'){
					this.ruleForm.yundongshijian = obj[o];
					this.ro.yundongshijian = true;
					continue;
					}
					if(o=='yundongqingkuang'){
					this.ruleForm.yundongqingkuang = obj[o];
					this.ro.yundongqingkuang = true;
					continue;
					}
					if(o=='yonghuzhanghao'){
					this.ruleForm.yonghuzhanghao = obj[o];
					this.ro.yonghuzhanghao = true;
					continue;
					}
					if(o=='yonghuxingming'){
					this.ruleForm.yonghuxingming = obj[o];
					this.ro.yonghuxingming = true;
					continue;
					}
				}
			}
			this.styleChange()
            this.$forceUpdate()
			
			if (uni.getStorageSync('raffleType') && uni.getStorageSync('raffleType') != null) {
				uni.removeStorageSync('raffleType')
				setTimeout(() => {
					this.onSubmitTap()
				}, 300)
			}
		},
		methods: {
		// 获取时间间隔 单位小时
		getHour(first, last){
			let date1 = new Date(first)
			let date2 = new Date(last)
			let a = date1.getTime();
			let b = date2.getTime();
			var count = 0;
			for (var i = a; i < b; i += 3600 * 1000) {
				count++;
			}
			return count;
		},
            yundongqingkuangChange(e) {
                this.ruleForm.yundongqingkuang = e
            },
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv . .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},
			// 下二随
			async yundongleixingChange (e) {
				this.yundongleixingIndex = e.target.value
				this.ruleForm.yundongleixing = this.yundongleixingOptions[this.yundongleixingIndex]
				let res = await this.$api.follow(`yundongleixing`, `yundongleixing`,{
					columnValue: this.ruleForm.yundongleixing
				});
				if(res.data.kaluli){
					this.ruleForm.kaluli = res.data.kaluli
				}
			},

			// 多级联动参数

			yundongshijianChange(e) {
				this.ruleForm.yundongshijian = e.target.value;
				this.$forceUpdate();
			},

			// 日长控件选择日期时间
			kaishishijianConfirm(val) {
				console.log(val)
				this.ruleForm.kaishishijian = val.result;
				this.$forceUpdate();
			},
			// 日长控件选择日期时间
			jieshushijianConfirm(val) {
				console.log(val)
				this.ruleForm.jieshushijian = val.result;
				this.$forceUpdate();
			},


			yundongtupianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.yundongtupian = 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},

			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {
				if(this.ruleForm.yundongshizhang==0){
					this.$utils.msg('运动时长不能为空')
					return false
				}
				if(this.ruleForm.zongxiaohao==0){
					this.$utils.msg('总消耗不能为空')
					return false
				}
//跨表计算判断
				var obj;
				if(this.ruleForm.kaluli&&(!this.$validate.isNumber(this.ruleForm.kaluli))){
					this.$utils.msg(`卡路里/小时应输入数字`);
					return
				}
				if(this.ruleForm.yundongshizhang&&(!this.$validate.isNumber(this.ruleForm.yundongshizhang))){
					this.$utils.msg(`运动时长应输入数字`);
					return
				}
				//更新跨表属性
				var crossuserid;
				var crossrefid;
				var crossoptnum;
				if(this.cross){
                    uni.setStorageSync('crossCleanType',true);
					var statusColumnName = uni.getStorageSync('statusColumnName');
					var statusColumnValue = uni.getStorageSync('statusColumnValue');
					if(statusColumnName!='') {
                        if(!obj) {
						    obj = uni.getStorageSync('crossObj');
                        }
						if(!statusColumnName.startsWith("[")) {
							for (var o in obj){
								if(o==statusColumnName){
									obj[o] = statusColumnValue;
								}

							}
							var table = uni.getStorageSync('crossTable');
							await this.$api.update(`${table}`, obj);
						} else {
						       crossuserid=Number(uni.getStorageSync('appUserid'));
						       crossrefid=obj['id'];
						       crossoptnum=uni.getStorageSync('statusColumnName');
						       crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
						}
					}
				}
				if(crossrefid && crossuserid) {
					this.ruleForm.crossuserid=crossuserid;
					this.ruleForm.crossrefid=crossrefid;
					let params = {
						page: 1,
						limit:10,
						crossuserid:crossuserid,
						crossrefid:crossrefid,
					}
					let res = await this.$api.list(`yundongjilu`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
                        uni.removeStorageSync('crossCleanType');
						return false;
					} else {
                //跨表计算
						if(this.ruleForm.id){
							await this.$api.update(`yundongjilu`, this.ruleForm);
						}else{
							await this.$api.add(`yundongjilu`, this.ruleForm);
						}
						this.$utils.msgBack('提交成功');
					}
				} else {
                //跨表计算
					if(this.ruleForm.id){
						await this.$api.update(`yundongjilu`, this.ruleForm);
					}else{
						await this.$api.add(`yundongjilu`, this.ruleForm);
					}
					this.$utils.msgBack('提交成功');
				}
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				if(this.ro[str]){
					return false
				}
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
