package org.qqz.yygh.cmn.service;

import org.qqz.yygh.model.cmn.Dict;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public interface DictService extends IService<Dict> {
    List<Dict> findChlidData(Long id);
}
