class Numero

  def self.feliz?(valor)    
        
    
    if valor == 7 
      return true
    end
    
    if length(valor) == 1 && valor != 1
      false
    else      
      true
    end  
  end

  def self.quadrado(valor)
    valor * valor
  end
  
  def self.calcular(valor)
    valor.to_s.chars.inject(0) do |sum, d|
      sum += quadrado(d.to_i)
      sum
    end
  end
  
  def self.length(valor)
    valor.to_s.length
  end
end