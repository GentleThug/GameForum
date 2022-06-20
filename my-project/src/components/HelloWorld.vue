<template>
  <div class="hello">
    <h1>会员登录</h1>
<!--    <form action="" method="post">-->
      <p><input type="text" class="inputBox" placeholder="手机号/用户名/邮箱" v-model="username"></p>
      <p><input type="password" class="inputBox" placeholder="密码" v-model="password"></p>
      <button type="submit" class="user-login-btn" @click="userLogin">登录</button>
      <br>
      <router-link to="/userRegister">
          <a class="regBtn" @click="toUserRegisterPage" >新会员注册</a>
      </router-link>
      |
    <a class="regBtn" @click="toForgetPwdPage" >忘记密码</a>
<!--    </form>-->

  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "hello",
  data() {
    return {
      username: '',
      password: '',
    }
  },
  methods: {
    toUserRegisterPage(){
      axios.post('http://localhost:8081/toUserRegisterPage', {

      }).then(function(res){
        alert('进入注册页面');
      })
    },
    toForgetPwdPage(){
      axios.post('http://localhost:8081/toForgetPwdPage', {

      }).then(function(res){
        alert('进入忘记密码页面');
      })
    },
    userLogin(){
      console.log(this.username)
      console.log(this.password)
      axios({
        method:"post",
        url:"http://localhost:8081/userLogin",
        params:{
          username: this.username,
          password: this.password
        }
      }).then(function (res){
        console.log(res);
      })
      // axios.post('http://localhost:8081/userLogin', {
      //   username: this.username,
      //   password: this.password
      // }, ).then(function(res){
      //   // console.log(res);
      // })
    },
  }
}
</script>
<style>
    .inputBox{
      height: 40px;
      width: 358px !important;
      border: 1px solid #c5ccdb;
      margin-top: 1px;
      border-radius: 4px;
      padding: 4px 12px !important;
    }
    .regBtn{
      color: black;
    }
    .regBtn:hover{
      color: cornflowerblue;
    }
    .user-login-btn {
      /*display: block;*/
      margin-top: 0;
      margin-bottom: 10px;
      width: 12%;
      line-height: 50px;
      /*background: #2468F2;*/
      /*background-color: rgb(36, 104, 242);*/
      background-image: none;
      background-image: -webkit-linear-gradient(top, #2468f2, #2468f2);
      font-size: 20px;
      color: #fff;
      border: none;
      box-shadow: none;
      border-radius: 10px;
    }
</style>
