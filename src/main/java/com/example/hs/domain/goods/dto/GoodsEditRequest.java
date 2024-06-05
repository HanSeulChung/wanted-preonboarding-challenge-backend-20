package com.example.hs.domain.goods.dto;

import com.example.hs.domain.goods.type.GoodsStatus;
import com.example.hs.domain.goods.type.GoodsStatusDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GoodsEditRequest {
  @NotBlank(message = "상품 이름은 필수 입니다.")
  private String goodsName;
  @NotBlank(message = "상품 설명은 필수 입니다.")
  private String description;
  @NotNull(message = "상품 가격은 필수 입니다.")
  private int price;
  @NotNull(message = "상품 갯수는 필수 입니다.")
  private int quantity;
  @NotNull(message = "상품 상태는 필수 입니다.")
  @JsonDeserialize(using = GoodsStatusDeserializer.class)
  private GoodsStatus goodsStatus;
}
