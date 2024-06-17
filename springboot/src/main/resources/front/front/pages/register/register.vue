<template>
<view class="content">
	<view class="box" :style='{"minHeight":"100vh","padding":"80rpx 24rpx 24rpx","alignItems":"flex-start","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20240221/0e49410173244550af4a20b298dd0979.png) no-repeat center top / 100% 100%,#4ab030","display":"flex","width":"100%","height":"auto"}'>
		<view :style='{"padding":"96rpx 60rpx 96rpx 20rpx","margin":"40rpx 0 80rpx","borderRadius":"16rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20240221/d6a8211fdbd94e28bc42b938de7b9b84.png) no-repeat center top / 100% 100%","display":"flex","width":"100%","position":"relative","height":"auto"}'>
			<image :style='{"width":"160rpx","margin":"0 auto 60rpx","borderRadius":"8rpx","display":"none","height":"160rpx"}' src="http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg" mode="aspectFill"></image>
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#eee","alignItems":"center","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<view :style='{"color":"rgb(0, 0, 0)","textAlign":"right","display":"block","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"160rpx","fontWeight":"500"}' class="label">用户账号：</view>
				<input :style='{"border":"2rpx solid rgba(255,255,255,.8)","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"60rpx","flex":"1","background":"#DDD5D5","fontSize":"28rpx","height":"76rpx"}'  v-model="ruleForm.yonghuzhanghao"  type="text"  class="uni-input" name="" placeholder="用户账号" />
			</view>
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#eee","alignItems":"center","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<view :style='{"color":"rgb(0, 0, 0)","textAlign":"right","display":"block","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"160rpx","fontWeight":"500"}' class="label">密码：</view>
				<input :style='{"border":"2rpx solid rgba(255,255,255,.8)","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"60rpx","flex":"1","background":"#DDD5D5","fontSize":"28rpx","height":"76rpx"}'  v-model="ruleForm.mima" type="password"  class="uni-input" name="" placeholder="密码" />
			</view>
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#eee","alignItems":"center","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<view :style='{"color":"rgb(0, 0, 0)","textAlign":"right","display":"block","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"160rpx","fontWeight":"500"}' class="label">确认密码：</view>
				<input :style='{"border":"2rpx solid rgba(255,255,255,.8)","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"60rpx","flex":"1","background":"#DDD5D5","fontSize":"28rpx","height":"76rpx"}' v-model="ruleForm.mima2" type="password" class="uni-input" name="" placeholder="确认密码" />
			</view>
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#eee","alignItems":"center","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<view :style='{"color":"rgb(0, 0, 0)","textAlign":"right","display":"block","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"160rpx","fontWeight":"500"}' class="label">用户姓名：</view>
				<input :style='{"border":"2rpx solid rgba(255,255,255,.8)","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"60rpx","flex":"1","background":"#DDD5D5","fontSize":"28rpx","height":"76rpx"}'  v-model="ruleForm.yonghuxingming"  type="text"  class="uni-input" name="" placeholder="用户姓名" />
			</view>
            <view :style='{"margin":"0 0 60rpx 0","borderColor":"#eee","alignItems":"center","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="">
				<view :style='{"color":"rgb(0, 0, 0)","textAlign":"right","display":"block","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"160rpx","fontWeight":"500"}' class="label">性别：</view>
				<picker :style='{"width":"100%","margin":"0 0 24rpx 0","alignItems":"center","display":"flex","height":"76rpx"}' v-if="tableName=='yonghu'"  @change="yonghuxingbieChange" :value="yonghuxingbieIndex" :range="yonghuxingbieOptions">
					<view>
						<view :style='{"border":"2rpx solid rgba(255,255,255,.8)","padding":"0 20rpx","color":"#666","borderRadius":"40rpx","background":"#DDD5D5","width":"100%","lineHeight":"76rpx","fontSize":"28rpx"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
					</view>
				</picker>
			</view>
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#eee","alignItems":"center","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<view :style='{"color":"rgb(0, 0, 0)","textAlign":"right","display":"block","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"160rpx","fontWeight":"500"}' class="label">联系方式：</view>
				<input :style='{"border":"2rpx solid rgba(255,255,255,.8)","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"60rpx","flex":"1","background":"#DDD5D5","fontSize":"28rpx","height":"76rpx"}'  v-model="ruleForm.lianxifangshi"  type="text"  class="uni-input" name="" placeholder="联系方式" />
			</view>
            <view :style='{"margin":"0 0 60rpx 0","borderColor":"#eee","alignItems":"center","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" @tap="yonghutouxiangTap" class="">
				<view :style='{"color":"rgb(0, 0, 0)","textAlign":"right","display":"block","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"160rpx","fontWeight":"500"}' class="label">头像：</view>
				<image :style='{"width":"160rpx","margin":"0 0 20rpx","borderRadius":"40rpx","objectFit":"cover","display":"block","height":"100rpx"}' v-if="ruleForm.touxiang" class="avator" :src="baseUrl+ruleForm.touxiang" mode=""></image>
                <image :style='{"width":"160rpx","margin":"0 0 20rpx","borderRadius":"40rpx","objectFit":"cover","display":"block","height":"100rpx"}' v-else class="avator" src="../../static/gen/upload.png" mode=""></image>
            </view>
			<button :style='{"border":"0","padding":"0px","boxShadow":"0px 8rpx 20rpx 0px rgba(0,0,0,0.3)","margin":"48rpx auto 24rpx","color":"#fff","bottom":"-48rpx","borderRadius":"16rpx","left":"25%","background":"#F6BE1E","width":"50%","lineHeight":"88rpx","fontSize":"32rpx","position":"absolute","height":"88rpx"}' class="btn-submit" @tap="register" type="primary">注册</button>
			
			<view class="idea1" :style='{"width":"100%","background":"red","display":"none","height":"80rpx"}'>idea1</view>
			<view class="idea2" :style='{"width":"100%","background":"red","display":"none","height":"80rpx"}'>idea2</view>
			<view class="idea3" :style='{"width":"100%","background":"red","display":"none","height":"80rpx"}'>idea3</view>
		</view>
	</view>
</view>
</template>

<script>
    import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
                yonghuxingbieOptions: [],
                yonghuxingbieIndex: 0,
				ruleForm: {
                yonghuzhanghao: '',
                mima: '',
                yonghuxingming: '',
                xingbie: '',
                lianxifangshi: '',
                touxiang: '',
				},
				tableName:""
			}
		},
        components: {
            multipleSelect
        },
        computed: {
            baseUrl() {
                return this.$base.url;
            },
        },
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
            this.tableName = table;

                        // 自定义下拉框值
			if(this.tableName=='yonghu'){
                this.yonghuxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.yonghuxingbieOptions[0]
			}
			
			this.styleChange()
		},
		methods: {

            // 下拉变化
            yonghuxingbieChange(e) {
                    this.yonghuxingbieIndex = e.target.value
                    this.ruleForm.xingbie = this.yonghuxingbieOptions[this.yonghuxingbieIndex]
            },
            yonghutouxiangTap() {
                let _this = this;
                this.$api.upload(function(res) {
                    _this.ruleForm.touxiang = 'upload/' + res.file;
					_this.$forceUpdate();
                });
            },

            toggleTab(str) {
                this.$refs[str].show();
            },

			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.registerFrom.content.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 注册
			async register() {
				
				if((!this.ruleForm.yonghuzhanghao) && `yonghu` == this.tableName){
					this.$utils.msg(`用户账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `yonghu` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
                if(`yonghu` == this.tableName && (this.ruleForm.mima!=this.ruleForm.mima2)){
                    this.$utils.msg(`两次密码输入不一致`);
                    return
                }
				if((!this.ruleForm.yonghuxingming) && `yonghu` == this.tableName){
					this.$utils.msg(`用户姓名不能为空`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.lianxifangshi&&(!this.$validate.isMobile(this.ruleForm.lianxifangshi))){
					this.$utils.msg(`联系方式应输入手机格式`);
					return
				}
				await this.$api.register(`${this.tableName}`, this.ruleForm);
				this.$utils.msgBack('注册成功');;
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
