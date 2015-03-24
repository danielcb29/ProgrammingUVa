#flatten.rb

def flatten(array)
  if array.empty?
    []
  else
    out=[]
    array.each do |value|
      if value.kind_of?(Array)
        value.each do |newval|
          out.push(newval)
        end
      else
        out.push(value)
      end
    end
    out
  end
end

puts flatten([[1,2,3],[],['a','p']])
puts flatten([1, 2, 3])
puts flatten([])