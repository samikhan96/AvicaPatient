package com.vivalnk.sdk.demo.base.i18n;

import com.vivalnk.google.gson.reflect.TypeToken;
import com.vivalnk.sdk.utils.GSON;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class ErrorMessageData {

  static String msg_map_json = "{"
      + "\"" + "0" + "\":" + "\"" + "success" + "\", "
      + "\"" + "1" + "\":" + "\"" + "android device not support BLE" + "\", "
      + "\"" + "2" + "\":" + "\"" + "no bluetooth permission" + "\", "
      + "\"" + "4" + "\":" + "\"" + "no bluetooth admin permission" + "\", "
      + "\"" + "8" + "\":" + "\"" + "bluetooth not available" + "\", "
      + "\"" + "16" + "\":" + "\"" + "bluetooth not enable" + "\", "
      + "\"" + "32" + "\":" + "\"" + "sd card not available" + "\", "
      + "\"" + "256" + "\":" + "\"" + "no sd card write permission" + "\", "
      + "\"" + "4096" + "\":" + "\"" + "no location permission" + "\", "
      + "\"" + "8192" + "\":" + "\"" + "location not enable" + "\", "
      + "\"" + "3001" + "\":" + "\"" + "can not start scan patch" + "\", "
      + "\"" + "3101" + "\":" + "\"" + "can not open system GATT component" + "\", "
      + "\"" + "3102" + "\":" + "\"" + "can not get gatt service" + "\", "
      + "\"" + "3103" + "\":" + "\"" + "can not get info service" + "\", "
      + "\"" + "3104" + "\":" + "\"" + "can not write characteristic" + "\", "
      + "\"" + "3105" + "\":" + "\"" + "connect device timeout" + "\", "
      + "\"" + "3106" + "\":" + "\"" + "connect error" + "\", "
      + "\"" + "3107" + "\":" + "\"" + "connect user cancel bond" + "\", "
      + "\"" + "3200" + "\":" + "\"" + "BLE I/O request exception" + "\", "
      + "\"" + "3201" + "\":" + "\"" + "BLE I/O cancel request" + "\", "
      + "\"" + "3202" + "\":" + "\"" + "BLE I/O request time out" + "\", "
      + "\"" + "3203" + "\":" + "\"" + "BLE I/O request queue is full" + "\", "
      + "\"" + "3204" + "\":" + "\"" + "BLE I/O request fail" + "\", "
      + "\"" + "3205" + "\":" + "\"" + "BLE I/O request success" + "\", "
      + "\"" + "3206" + "\":" + "\"" + "BLE I/O device is disconnected" + "\", "
      + "\"" + "3207" + "\":" + "\"" + "BLE I/O device already connected" + "\", "
      + "\"" + "3208" + "\":" + "\"" + "write characteristic exception" + "\", "
      + "\"" + "3209" + "\":" + "\"" + "BLE I/O MTU low api exception" + "\", "
      + "\"" + "4001" + "\":" + "\"" + "data is error" + "\", "
      + "\"" + "4002" + "\":" + "\"" + "parse patch data error" + "\", "
      + "\"" + "4003" + "\":" + "\"" + "patch in charging" + "\", "
      + "\"" + "4004" + "\":" + "\"" + "patch low voltage" + "\", "
      + "\"" + "4005" + "\":" + "\"" + "RF_TEST_PIN disable" + "\", "
      + "\"" + "4006" + "\":" + "\"" + "no flash data" + "\", "
      + "\"" + "4007" + "\":" + "\"" + "patch is uploading flash" + "\", "
      + "\"" + "4008" + "\":" + "\"" + "patch is switching work mode" + "\", "
      + "\"" + "4009" + "\":" + "\"" + "connect parameter update failed" + "\", "
      + "\"" + "4010" + "\":" + "\"" + "no uploading flash operation" + "\", "
      + "\"" + "4011" + "\":" + "\"" + "aother command is executing" + "\", "
      + "\"" + "4012" + "\":" + "\"" + "input parameter failed" + "\", "
      + "\"" + "4013" + "\":" + "\"" + "unknown exception" + "\", "
      + "\"" + "4014" + "\":" + "\"" + "clock not set" + "\", "
      + "\"" + "4015" + "\":" + "\"" + "self test failed" + "\", "
      + "\"" + "4016" + "\":" + "\"" + "check sum failed" + "\", "
      + "\"" + "4017" + "\":" + "\"" + "patch on sampling" + "\", "
      + "\"" + "4018" + "\":" + "\"" + "patch not on sampling" + "\", "
      + "\"" + "4019" + "\":" + "\"" + "unknown SF mode" + "\", "
      + "\"" + "4020" + "\":" + "\"" + "already current SF mode" + "\", "
      + "\"" + "4021" + "\":" + "\"" + "already write SN" + "\", "
      + "\"" + "4022" + "\":" + "\"" + "already write HW" + "\", "
      + "\"" + "4023" + "\":" + "\"" + "already write security key" + "\", "
      + "\"" + "4024" + "\":" + "\"" + "un-support command" + "\", "
      + "\"" + "4025" + "\":" + "\"" + "OTA failed" + "\", "
      + "\"" + "4026" + "\":" + "\"" + "invalid command" + "\", "
      + "\"" + "4027" + "\":" + "\"" + "already set this SF mode" + "\", "
      + "\"" + "4028" + "\":" + "\"" + "clock sync failed" + "\", "
      + "\"" + "4029" + "\":" + "\"" + "data receive time out" + "\", "
      + "\"" + "4030" + "\":" + "\"" + "invalde acc sampling frquency" + "\", "
      + "\"" + "4031" + "\":" + "\"" + "already set this channel number" + "\", "
      + "\"" + "4032" + "\":" + "\"" + "command failed" + "\", "
      + "\"" + "4039" + "\":" + "\"" + "OTA file not supported" + "\", "
      + "\"" + "4040" + "\":" + "\"" + "low battery, can not OTA" + "\", "
      + "\"" + "4041" + "\":" + "\"" + "already set the parameters" + "\", "
      + "\"" + "4042" + "\":" + "\"" + "error input parameters" + "\", "
      + "\"" + "4043" + "\":" + "\"" + "OTA first please " + "\", "
      + "\"" + "4097" + "\":" + "\"" + "command request timeout" + "\", "
      + "\"" + "4101" + "\":" + "\"" + "patch's flash component test error" + "\", "
      + "\"" + "4102" + "\":" + "\"" + "patch's accelerate component test error" + "\", "
      + "\"" + "4103" + "\":" + "\"" + "patch is lead off" + "\", "
      + "\"" + "4104" + "\":" + "\"" + "patch in charging" + "\", "
      + "\"" + "5000" + "\":" + "\"" + "request parameter error" + "\""
      + "}";

  static String msg_map_json_zh_CN = "{"
      + "\"" + "0" + "\":" + "\"" + "成功" + "\", "
      + "\"" + "1" + "\":" + "\"" + "设备不支持低功耗蓝牙" + "\", "
      + "\"" + "2" + "\":" + "\"" + "没有蓝牙权限" + "\", "
      + "\"" + "4" + "\":" + "\"" + "没有蓝牙管理权限" + "\", "
      + "\"" + "8" + "\":" + "\"" + "蓝牙模块不可用" + "\", "
      + "\"" + "16" + "\":" + "\"" + "蓝牙未开启" + "\", "
      + "\"" + "32" + "\":" + "\"" + "SD卡不可用" + "\", "
      + "\"" + "256" + "\":" + "\"" + "没有SD卡写权限" + "\", "
      + "\"" + "4096" + "\":" + "\"" + "没有位置权限" + "\", "
      + "\"" + "8192" + "\":" + "\"" + "定位服务未开启" + "\", "
      + "\"" + "3001" + "\":" + "\"" + "无法开启扫描" + "\", "
      + "\"" + "3101" + "\":" + "\"" + "无法打卡系统GATT模块组件" + "\", "
      + "\"" + "3102" + "\":" + "\"" + "无法获取GATT服务" + "\", "
      + "\"" + "3103" + "\":" + "\"" + "无法获取Service信息" + "\", "
      + "\"" + "3104" + "\":" + "\"" + "无法写Characteristic" + "\", "
      + "\"" + "3105" + "\":" + "\"" + "连接设备超时" + "\", "
      + "\"" + "3106" + "\":" + "\"" + "连接错误" + "\", "
      + "\"" + "3107" + "\":" + "\"" + "连接过程中，用户取消设备" + "\", "
      + "\"" + "3200" + "\":" + "\"" + "BLE I/O 请求异常" + "\", "
      + "\"" + "3201" + "\":" + "\"" + "BLE I/O 请求取消" + "\", "
      + "\"" + "3202" + "\":" + "\"" + "BLE I/O 请求超时" + "\", "
      + "\"" + "3203" + "\":" + "\"" + "BLE I/O 请求队列满" + "\", "
      + "\"" + "3204" + "\":" + "\"" + "BLE I/O 请求失败" + "\", "
      + "\"" + "3205" + "\":" + "\"" + "BLE I/O 请求成功" + "\", "
      + "\"" + "3206" + "\":" + "\"" + "BLE I/O 设备断开连接" + "\", "
      + "\"" + "3207" + "\":" + "\"" + "BLE I/O 设备已经连接" + "\", "
      + "\"" + "3208" + "\":" + "\"" + "BLE I/O Characteristic写失败" + "\", "
      + "\"" + "3209" + "\":" + "\"" + "BLE I/O MTU low api exception" + "\", "
      + "\"" + "4001" + "\":" + "\"" + "设备数据异常" + "\", "
      + "\"" + "4002" + "\":" + "\"" + "设备数据解析异常" + "\", "
      + "\"" + "4003" + "\":" + "\"" + "设备正在充电" + "\", "
      + "\"" + "4004" + "\":" + "\"" + "设备电量过低" + "\", "
      + "\"" + "4005" + "\":" + "\"" + "RF_TEST_PIN 不可用" + "\", "
      + "\"" + "4006" + "\":" + "\"" + "没有闪存数据" + "\", "
      + "\"" + "4007" + "\":" + "\"" + "设备正在上传闪存数据" + "\", "
      + "\"" + "4008" + "\":" + "\"" + "设备正在切换模式中" + "\", "
      + "\"" + "4009" + "\":" + "\"" + "连接参数更新异常" + "\", "
      + "\"" + "4010" + "\":" + "\"" + "没有闪存数据上传操作" + "\", "
      + "\"" + "4011" + "\":" + "\"" + "另一个操作正在进行中" + "\", "
      + "\"" + "4012" + "\":" + "\"" + "输出参数异常" + "\", "
      + "\"" + "4013" + "\":" + "\"" + "未知异常" + "\", "
      + "\"" + "4014" + "\":" + "\"" + "时钟未设置" + "\", "
      + "\"" + "4015" + "\":" + "\"" + "自检失败" + "\", "
      + "\"" + "4016" + "\":" + "\"" + "数据校验失败" + "\", "
      + "\"" + "4017" + "\":" + "\"" + "设备当前正在采样" + "\", "
      + "\"" + "4018" + "\":" + "\"" + "设备当前没有在采样" + "\", "
      + "\"" + "4019" + "\":" + "\"" + "未知的 SF 模式" + "\", "
      + "\"" + "4020" + "\":" + "\"" + "已经在当前 SF 模式" + "\", "
      + "\"" + "4021" + "\":" + "\"" + "已经写过SN号了" + "\", "
      + "\"" + "4022" + "\":" + "\"" + "已经写过硬件版本号了" + "\", "
      + "\"" + "4023" + "\":" + "\"" + "已经写过安全密钥了" + "\", "
      + "\"" + "4024" + "\":" + "\"" + "不支持的命令" + "\", "
      + "\"" + "4025" + "\":" + "\"" + "OTA失败" + "\", "
      + "\"" + "4026" + "\":" + "\"" + "非法命令" + "\", "
      + "\"" + "4027" + "\":" + "\"" + "已经设置过的ACC采样模式" + "\", "
      + "\"" + "4028" + "\":" + "\"" + "时钟同步失败" + "\", "
      + "\"" + "4029" + "\":" + "\"" + "数据接收超时" + "\", "
      + "\"" + "4030" + "\":" + "\"" + "非法的ACC频率" + "\", "
      + "\"" + "4031" + "\":" + "\"" + "已经设置过该渠道号" + "\", "
      + "\"" + "4032" + "\":" + "\"" + "命令异常" + "\", "
      + "\"" + "4039" + "\":" + "\"" + "不支持的OT文件" + "\", "
      + "\"" + "4040" + "\":" + "\"" + "电量过低不能OTA" + "\", "
      + "\"" + "4041" + "\":" + "\"" + "当前已经设置过该参数" + "\", "
      + "\"" + "4042" + "\":" + "\"" + "不支持的参数设置" + "\", "
      + "\"" + "4043" + "\":" + "\"" + "请先OTA" + "\", "
      + "\"" + "4097" + "\":" + "\"" + "命令请求超时" + "\", "
      + "\"" + "4101" + "\":" + "\"" + "设备的闪存模组件自检失败" + "\", "
      + "\"" + "4102" + "\":" + "\"" + "设备的加速计模组件自检失败" + "\", "
      + "\"" + "4103" + "\":" + "\"" + "设备未导联" + "\", "
      + "\"" + "4104" + "\":" + "\"" + "设备正在充电" + "\", "
      + "\"" + "5000" + "\":" + "\"" + "请求参数错误" + "\","
      + "\"" + "5100" + "\":" + "\"" + "不支持的操作" + "\""
      + "}";

  private static Map<Integer, String> msg_Map_EN = new HashMap<>();
  private static Map<Integer, String> msg_Map_CN = new HashMap<>();

  static {
    Type type = new TypeToken<HashMap<Integer, String>>() {}.getType();
    msg_Map_CN = GSON.fromJson(msg_map_json_zh_CN, type);
    msg_Map_EN = GSON.fromJson(msg_map_json, type);
  }

  public static String getErrorMessage(Locale locale, int code, String msg) {
    switch (locale) {
      case cn:
        return msg_Map_CN.get(code) + ", details = " + msg;
      case en:
      default:
        return msg_Map_EN.get(code) + ", details = " + msg;
    }
  }

  public enum Locale {
    en, cn
  }
}
