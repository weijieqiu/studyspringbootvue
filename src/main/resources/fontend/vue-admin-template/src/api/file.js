import request from '@/utils/request'


export function getFileList(params) {
  return request({
    url: '/v1/file/list',
    method: 'get',
    params
  })
}
