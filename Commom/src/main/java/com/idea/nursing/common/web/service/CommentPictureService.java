package com.idea.nursing.common.web.service;

import com.idea.nursing.core.generic.GenericService;
import com.idea.nursing.common.web.domain.pojo.CommentPicture;
import com.idea.nursing.common.web.domain.pojo.CommentPictureExample;

public interface CommentPictureService extends GenericService<CommentPicture,Long,CommentPictureExample>{

    public Long[] insertPictures(String pictures,byte pictureType);

}
