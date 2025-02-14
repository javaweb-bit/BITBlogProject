package com.blogproject.jblog.repository;

import java.util.List;


import com.blogproject.jblog.vo.BlogVO;
import com.blogproject.jblog.vo.CategoryVO;
import com.blogproject.jblog.vo.PostVO;
import com.blogproject.jblog.vo.UserVO;

public interface BlogDAO {
	
	public BlogVO getBlogAdmin(String id);
	public BlogVO getBlogAdmin(Long no);
	public BlogVO getPage(String id);
	public List<PostVO> getPost(Long no);
	public List<CategoryVO> getCate(Long no);
	
	public int update(BlogVO vo);
	public int insertCate(CategoryVO vo);
	public int write(PostVO vo);
	
}
