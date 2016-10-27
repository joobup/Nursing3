package com.idea.nursing.common.web.service.impl;


import com.idea.nursing.core.common.SessionConstant;
import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.common.web.dao.CommentPictureMapper;
import com.idea.nursing.common.web.domain.pojo.CommentPicture;
import com.idea.nursing.common.web.domain.pojo.CommentPictureExample;
import com.idea.nursing.common.web.service.CommentPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class CommentPictureServiceImpl extends GenericServiceImpl<CommentPicture, Long,CommentPictureExample> implements CommentPictureService {
    @Autowired
    private CommentPictureMapper commentpictureMapper;

    @Override
    public GenericDao<CommentPicture, Long,CommentPictureExample> getDao() {
        return commentpictureMapper;
    }

    @Override
    public Long[] insertPictures(String[] pictures,byte pictureType) {
        Long[] pictureIds = new Long[pictures.length];
       if(pictures.length>0){
           int i=0;
           for (String pictureName:pictures
                ) {
               CommentPicture commentPicture = new CommentPicture();
               commentPicture.setPictureType(pictureType);
               commentPicture.getPictureAddress(pictureName);
               if(commentpictureMapper.insert(commentPicture)!=0){
                   pictureIds[i]=commentPicture.getId();
                   i++;
               }
           }
       }
        return  pictureIds;
    }
}
