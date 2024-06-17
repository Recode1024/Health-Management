<template>
	<view :style='{"minHeight":"100vh","padding":"0","flexWrap":"wrap","background":"#F1F1F1","display":"flex","width":"100%","position":"relative","justifyContent":"space-between","height":"auto"}'>
		<view class="title" :style='{"margin":"0 auto","borderColor":"#000","color":"#000","borderRadius":"16rpx 16rpx 0 0","textAlign":"center","background":"#FFF7DF","borderWidth":"2rpx 2rpx 0","width":"calc(100% - 48rpx)","lineHeight":"80rpx","fontSize":"32rpx","borderStyle":"solid"}'>{{detail.title}}</view>
		
		<view :style='{"padding":"0 24rpx","borderColor":"#000","margin":"0 auto","color":"#999","flexWrap":"wrap","background":"#FFF7DF","borderWidth":"0 2rpx","display":"flex","width":"calc(100% - 48rpx)","borderStyle":"solid","justifyContent":"center"}'>
		  <view :style='{"padding":"0","margin":"0 20rpx 0 0","order":"5"}'>
		    <text class="icon iconfont icon-shijian21" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"inherit"}'></text>
		    <text :style='{"color":"inherit","lineHeight":"1.5","fontSize":"24rpx"}'>发布时间：{{detail.addtime}}</text>
		  </view>
		  <view :style='{"padding":"0","margin":"0 20rpx 0 0"}'>
		    <text class="icon iconfont icon-geren11" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"inherit"}'></text>
		    <text :style='{"color":"inherit","lineHeight":"1.5","fontSize":"24rpx"}'>{{detail.name}}</text>
		  </view>
		  <view :style='{"padding":"0","margin":"0 20rpx 0 0"}'>
		    <text class="icon iconfont icon-zan10" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"inherit"}'></text>
		    <text :style='{"color":"inherit","lineHeight":"1.5","fontSize":"24rpx"}'>{{detail.thumbsupnum}}</text>
		  </view>
		  <view :style='{"padding":"0","margin":"0 20rpx 0 0"}'>
		    <text class="icon iconfont icon-shoucang10" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"inherit"}'></text>
		    <text :style='{"color":"inherit","lineHeight":"1.5","fontSize":"24rpx"}'>{{detail.storeupnum}}</text>
		  </view>
		  <view :style='{"padding":"0","margin":"0 20rpx 0 0"}'>
		    <text class="icon iconfont icon-chakan2" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"inherit"}'></text>
		    <text :style='{"color":"inherit","lineHeight":"1.5","fontSize":"24rpx"}'>{{detail.clicknum}}</text>
		  </view>
		</view>
		
		<view :style='{"padding":"20rpx 20rpx","borderColor":"#000","margin":"0 auto","alignItems":"center","background":"#FFF7DF","borderWidth":"0 2rpx","display":"flex","width":"calc(100% - 48rpx)","borderStyle":"solid","justifyContent":"flex-end"}'>
		  <view :style='{"padding":"0 10rpx","margin":"0 20rpx 0 0","alignItems":"center","borderRadius":"40rpx","background":"#0C77D5","display":"flex","width":"auto","minWidth":"120rpx","justifyContent":"center","height":"52rpx"}' @click="likeClick">
		    <text class="icon iconfont" :style='{"margin":"0 10rpx 0 0","lineHeight":"1.5","fontSize":"28rpx","color":"#fff"}' :class="likeType?'icon-zan10':'icon-zan10'"></text>
		    <text :style='{"color":"#fff","lineHeight":"1.5","fontSize":"24rpx"}'>{{likeType?'已':''}}赞</text>
		  </view>
		  <view :style='{"padding":"0 10rpx","alignItems":"center","borderRadius":"40rpx","background":"#F7D677","display":"flex","width":"auto","minWidth":"120rpx","justifyContent":"center","height":"52rpx"}' @click="collectClick">
		    <text class="icon iconfont" :style='{"margin":"0 10rpx 0 0","lineHeight":"1.5","fontSize":"28rpx","color":"#333"}' :class="collectType?'icon-shoucang10':'icon-shoucang10'"></text>
		    <text :style='{"color":"#333","lineHeight":"1.5","fontSize":"24rpx"}'>{{collectType?'已':''}}收藏</text>
		  </view>
		</view>
		
		<view class="content" :style='{"padding":"24rpx","margin":"0 auto","borderColor":"#000","background":"#FFF7DF","borderWidth":"0 2rpx","width":"calc(100% - 48rpx)","fontSize":"28rpx","borderStyle":"solid","height":"auto"}'>
			<rich-text :nodes="detail.content"></rich-text>
		</view>
		
		<div :style='{"padding":"0 24rpx 32rpx 24rpx","borderColor":"#000","margin":"0 auto 40rpx","alignItems":"center","borderRadius":"0 0 16rpx 16rpx","background":"#FFF7DF","borderWidth":"0 2rpx 2rpx","display":"flex","width":"calc(100% - 48rpx)","borderStyle":"solid","justifyContent":"space-between","height":"auto"}'>
		  <div @click="prepDetailClick" :style='{"padding":"10rpx 20rpx","borderColor":"#333","color":"#fff","borderRadius":"8rpx","borderWidth":"0 0 0px","background":"#0C77D5","width":"auto","lineHeight":"48rpx","fontSize":"24rpx","borderStyle":"solid"}'>上一篇：prev</div>
		  <div @click="nextDetailClick" :style='{"padding":"10rpx 20rpx","borderColor":"#333","color":"#fff","borderRadius":"8rpx","borderWidth":"0 0 0px","background":"#F6BE1E","width":"auto","lineHeight":"48rpx","fontSize":"24rpx","borderStyle":"solid"}'>下一篇：next</div>
		</div>
		

		<!-- 热门 -->
		<view class="hot" :style='{"width":"100%","padding":"60rpx 0 0","margin":"0 auto","background":"url(http://codegen.caihongy.cn/20240223/eece8113785146e0a55f0092d5c98ca1.png) no-repeat center top / 100% auto,#FFF7DF","height":"auto","order":"11"}'>
		  <view :style='{"padding":"0 24rpx","borderColor":"#38bf3e","margin":"0","color":"#fff","textAlign":"center","background":"none","borderWidth":"0px","width":"100%","fontSize":"40rpx","lineHeight":"60rpx","borderStyle":"solid","text-stroke":"2rpx #000000","fontWeight":"600","height":"auto"}'>热门信息</view>
		  <view :style='{"padding":"0","margin":"40rpx auto 0","borderRadius":"0 0 16rpx 16rpx","flexWrap":"wrap","background":"none","display":"flex","width":"calc(100% - 48rpx)","justifyContent":"space-between","height":"auto"}'>
		    <view v-for="(item,index) in hotList" :key="index" :style='{"border":"2rpx solid #000","padding":"0","margin":"0 0 40rpx","borderRadius":"12rpx","background":"#FCF2B3","width":"48%","height":"auto"}' @click="toDetail(item.id)">
			  <image :style='{"width":"calc(100% - 20rpx)","margin":"10rpx auto 0","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"220rpx"}' mode="aspectFill" :src="baseUrl + item.picture"></image>
		      <view :style='{"padding":"0 8rpx","margin":"0","overflow":"hidden","whiteSpace":"nowrap","color":"#000","textAlign":"center","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","textOverflow":"ellipsis"}'>{{ item.title }}</view>
		      <view :style='{"padding":"0 8rpx","color":"#fff","textAlign":"center","background":"#0C77D5","width":"100%","lineHeight":"60rpx","fontSize":"28rpx"}'>{{ item.addtime }}</view>
		    </view>
		  </view>
		</view>
		<!-- 推荐 -->
		<view class="recommend" :style='{"padding":"24rpx","margin":"40rpx 0","borderRadius":"16rpx","background":"#fff","display":"none","width":"100%","height":"auto","order":"12"}'>
		  <view :style='{"padding":"0 24rpx","borderColor":"#4AB030","margin":"20rpx 0 0","color":"#333","textAlign":"left","background":"none","borderWidth":"0 0 0 4rpx","width":"100%","fontSize":"32rpx","lineHeight":"1","borderStyle":"solid","fontWeight":"600","height":"auto"}'>热门推荐</view>
		  <view :style='{"padding":"0","margin":"40rpx 0 0","borderRadius":"0 0 16rpx 16rpx","flexWrap":"wrap","background":"#fff","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
		    <view v-for="(item,index) in recommendList" :key="index" :style='{"border":"0px solid #ed7d7b","padding":"1%","margin":"0 0 40rpx","borderRadius":"12rpx","background":"#fff","width":"48%","height":"auto"}' @click="toDetail(item.id)">
		      <image :style='{"width":"100%","margin":"0 0 6rpx","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"200rpx"}' mode="aspectFill" :src="baseUrl + item.picture"></image>
			  <view :style='{"padding":"0 8rpx","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"left","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","textOverflow":"ellipsis"}'>{{ item.title }}</view>
		      <view :style='{"width":"100%","padding":"0 8rpx","lineHeight":"48rpx","fontSize":"28rpx","color":"#888","textAlign":"right"}'>{{ item.addtime }}</view>
		    </view>
		  </view>
		</view>

	</view>
</template>
<script>
	export default {
		data() {
			return {
				detail: {},
				id: '',
				likeType: false,
				likeForm: {},
				collectType: false,
				collectForm: {},
				allList: [],
				currentIndex: 0,
				hotList: [],
				recommendList: [],
			}
		},
		async onLoad(options) {
			this.id = options.id;
			this.getInfo()
			
			this.getHotList()
			this.getRecommendList()
		},
		computed:{
			baseUrl() {
				return this.$base.url;
			},
			userid(){
				return uni.getStorageSync('appUserid')
			}
		},
		methods: {
			async getInfo(){
				let res = await this.$api.info('news', this.id)
				res.data.content = res.data.content.replace(/<img/g,'<img style="width: 100%;"');
				this.detail = res.data;
				uni.pageScrollTo({
					scrollTop: 0,
					duration: 100,
				})
				this.getLike()
				this.getCollect()
				res = await this.$api.list('news',{page:1,limit:100,sort:'addtime',order:'desc'})
				for(let x in res.data.list){
					if(res.data.list[x].id == this.id){
						this.currentIndex = Number(x)
						break
					}
				}
				this.allList = res.data.list
				
			},
			// 获取点赞状态
			async getLike() {
				let res = await this.$api.list('storeup', {
					page: 1,
					limit: 1,
					type: 21,
					userid: uni.getStorageSync('appUserid'),
					refid: this.id,
					tablename: 'news'
				})
				if (res.data.list.length) {
					this.likeType = true
					this.likeForm = res.data.list[0]
				} else {
					this.likeType = false
					this.likeForm = {}
				}
			},
			// 获取热门列表
			async getHotList(){
				let res = await this.$api.recommend('news',{page:1, limit: 4,sort:'addtime',order:'desc'})
				this.hotList = res.data.list;
			},
			// 获取推荐列表	
			async getRecommendList(){
				let res;
				if(uni.getStorageSync("appUserid")){
					res = await this.$api.recommend2('news',{page:1, limit: 4,sort:'addtime',order:'desc'})
				}else{
					res = await this.$api.recommend('news',{page:1, limit: 4,sort:'addtime',order:'desc'})
				}
				
				this.recommendList = res.data.list;
			},
			// 上一篇
			prepDetailClick(){
				if(this.currentIndex == 0){
					this.$message.error('已经是第一篇了')
					return false
				}
				this.currentIndex--
				this.id = this.allList[this.currentIndex].id
				this.getInfo()
			},
			// 下一篇
			nextDetailClick(){
				if(this.currentIndex == this.allList.length - 1){
					this.$message.error('已经是最后一篇了')
					return false
				}
				this.currentIndex++
				this.id = this.allList[this.currentIndex].id
				this.getInfo()
			},
			toDetail(id){
				this.id = id
				this.getInfo()
			},
			// 获取收藏状态
			async getCollect() {
				let res = await this.$api.list('storeup', {
					page: 1,
					limit: 1,
					type: 1,
					userid: uni.getStorageSync('appUserid'),
					refid: this.id,
					tablename: 'news'
				})
				if (res.data.list.length) {
					this.collectType = true
					this.collectForm = res.data.list[0]
				} else {
					this.collectType = false
					this.collectForm = {}
				}
			},
			// 点赞按钮
			async likeClick() {
				let that = this
				if (this.likeType) {
					uni.showModal({
						title: '提示',
						content: '是否取消点赞？',
						async success(res) {
							if (res.confirm) {
								await that.$api.del('storeup', JSON.stringify([that.likeForm.id]))
								that.$utils.msg('取消成功')
								that.detail.thumbsupnum--
								await that.$api.update('news', that.detail)
								that.getLike()
							}
						}
					})
				} else {
					await that.$api.add('storeup', {
						userid: uni.getStorageSync('appUserid'),
						refid: this.id,
						type: 21,
						name: this.detail.title,
						picture: this.detail.picture,
						tablename: 'news',
					})
					this.$utils.msg('点赞成功')
					that.detail.thumbsupnum++
					await that.$api.update('news', that.detail)
					this.getLike()
				}
			},
			// 收藏按钮
			async collectClick() {
				let that = this
				if (this.collectType) {
					uni.showModal({
						title: '提示',
						content: '是否取消收藏？',
						async success(res) {
							if (res.confirm) {
								await that.$api.del('storeup', JSON.stringify([that.collectForm.id]))
								that.$utils.msg('取消成功')
								that.detail.storeupnum--
								await that.$api.update('news', that.detail)
								that.getCollect()
							}
						}
					})
				} else {
					await that.$api.add('storeup', {
						userid: uni.getStorageSync('appUserid'),
						refid: this.id,
						type: 1,
						name: this.detail.title,
						picture: this.detail.picture,
						tablename: 'news',
					})
					this.$utils.msg('收藏成功')
					that.detail.storeupnum++
					await that.$api.update('news', that.detail)
					this.getCollect()
				}
			},
		}
	}
</script>

<style scoped lang="scss">
	page {
		background: #FFFFFF;
	}

	.title {
		text-align: center;
		font-size: 40upx;
		font-weight: bold;
		margin: 20upx;
	}

	.content {
		margin: 40upx;
		font-size: 30upx;
		line-height: 50upx;
		letter-spacing: 5upx;
	}
	.operateView {
		width: 100%;
		display: flex;
		align-items: center;
		justify-content: space-around;

		.like_box {
			width: 40%;
			display: flex;
			align-items: center;
			justify-content: center;
			font-size: 32rpx;

			.icon {
				font-size: 36rpx;
				padding: 0 6rpx;
			}
		}

		.likeActive {
			color: #f00;
		}
	}
</style>
