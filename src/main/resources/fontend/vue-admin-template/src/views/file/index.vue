<template>
  <div>
    <span>参考: https://element.eleme.cn/#/zh-CN/component/upload</span><br/>
    <span>示例: 点击上传</span>
    <el-upload
      class="upload-demo"
      action="http://localhost:8050/v1/file/upload"
      :on-preview="handlePreview"
      :on-remove="handleRemove"
      :before-remove="beforeRemove"
      multiple
      :on-exceed="handleExceed"
      :file-list="fileList"
      name="file">
      <el-button size="small" type="primary">点击上传</el-button>
      <div slot="tip" class="el-upload__tip">上传单个文件不超过1MB，并且单次上传大小不超过10MB</div>
    </el-upload>
  </div>

</template>

<script>
  import {getFileList} from '@/api/file'

  export default {
    data() {
      return {
        fileList: []
      };
    },
    created() {
      // getFileList().then(response => {
      //   this.result = response.data
      // })
    },
    methods: {
      handleRemove(file, fileList) {
        console.log(file, fileList);
      },
      handlePreview(file) {
        console.log(file);
      },
      handleExceed(files, fileList) {
        this.$message.warning(`当前限制选择 3 个文件，本次选择了 ${files.length} 个文件，共选择了 ${files.length + fileList.length} 个文件`);
      },
      beforeRemove(file, fileList) {
        return this.$confirm(`确定移除 ${file.name}？`);
      }
    }
  }
</script>

<style scoped>
  .avatar-uploader .el-upload {
    border: 1px dashed #d9d9d9;
    border-radius: 6px;
    cursor: pointer;
    position: relative;
    overflow: hidden;
  }

  .avatar-uploader .el-upload:hover {
    border-color: #409EFF;
  }

  .avatar-uploader-icon {
    font-size: 28px;
    color: #8c939d;
    width: 178px;
    height: 178px;
    line-height: 178px;
    text-align: center;
  }

  .avatar {
    width: 178px;
    height: 178px;
    display: block;
  }
</style>
