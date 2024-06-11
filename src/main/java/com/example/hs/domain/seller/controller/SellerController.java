package com.example.hs.domain.seller.controller;

import com.example.hs.domain.goods.dto.GoodsDto;
import com.example.hs.domain.goods.type.GoodsStatus;
import com.example.hs.domain.seller.service.SellerService;
import com.example.hs.global.security.userdetails.CustomUserDetails;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sellers")
public class SellerController {
  private final SellerService sellerService;

  @GetMapping("/goods")
  public ResponseEntity<List<GoodsDto>> getGoods(@AuthenticationPrincipal CustomUserDetails member) {
    return ResponseEntity.ok(sellerService.getAllMyGoods(member));
  }

  @GetMapping("/goods/{goodsStatus}")
  public ResponseEntity<List<GoodsDto>> getGoodsByStatus(@AuthenticationPrincipal CustomUserDetails member,
      @PathVariable GoodsStatus goodsStatus) {
    return ResponseEntity.ok(sellerService.getAllMyGoodsInStatus(member, goodsStatus));
  }

}
